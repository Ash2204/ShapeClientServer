package server;

/**
 * 
 * @Author Ashley
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;

import shape.Circle;
import shape.Command;
import shape.Cylinder;
import shape.Rectangle;
import shape.Shape;
import shape.Sphere;
import shape.Triangle;

public class ClientThread extends Thread {

	private Socket socket;
	private int id;

	public ClientThread(Socket socket, int clientId) {
		this.socket = socket;
		this.id = clientId;
	}

	@Override
	public void run() {
		try {
			OutputStream outToServer = socket.getOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(outToServer);

			InputStream inFromServer = socket.getInputStream();
			ObjectInputStream objectIn = new ObjectInputStream(inFromServer);

			LinkedList<Shape> result = null;

			while (true) {
				Command cmd = null;
				try {
					cmd = (Command) objectIn.readObject();
				} catch (Exception e) {
					System.out.println("current client closed.");
					break;
				}

				if (cmd.cmd_type.equals("save")) {

					result = (LinkedList<Shape>) cmd.data;

					System.out.println("Save request, " + result.size());

					PrintWriter writer;
					writer = new PrintWriter("result" + this.id + ".txt", "UTF-8");

					for (final Shape shape : result) {
						writer.println(shape.toString());
					}

					writer.close();

				} else if (cmd.cmd_type.equals("R")) {

					LinkedList<Shape> getR = new LinkedList<Shape>();

					for (final Shape shape : result) {
						if (shape instanceof Rectangle) {
							getR.add(shape);
						}

					}

					out.writeObject(getR);
					out.flush();
					out.reset();

				} else if (cmd.cmd_type.equals("A")) {

					out.writeObject(result);
					out.flush();
					out.reset();

				} else if (cmd.cmd_type.equals("C")) {
					LinkedList<Shape> getR = new LinkedList<Shape>();

					for (final Shape shape : result) {
						if (shape instanceof Circle) {
							getR.add(shape);
						}

					}

					out.writeObject(getR);
					out.flush();
					out.reset();
				} else if (cmd.cmd_type.equals("T")) {
					LinkedList<Shape> getR = new LinkedList<Shape>();

					for (final Shape shape : result) {
						if (shape instanceof Triangle) {
							getR.add(shape);
						}

					}

					out.writeObject(getR);
					out.flush();
					out.reset();

				} else if (cmd.cmd_type.equals("S")) {
					LinkedList<Shape> getR = new LinkedList<Shape>();

					for (final Shape shape : result) {
						if (shape instanceof Sphere) {
							getR.add(shape);
						}

					}

					out.writeObject(getR);
					out.flush();
					out.reset();

				} else if (cmd.cmd_type.equals("Y")) {
					LinkedList<Shape> getR = new LinkedList<Shape>();

					for (final Shape shape : result) {
						if (shape instanceof Cylinder) {
							getR.add(shape);
						}

					}

					out.writeObject(getR);
					out.flush();
					out.reset();

				} else if (cmd.cmd_type.equals("EXIT")) {
					break;
				}
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			out.close();
			objectIn.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


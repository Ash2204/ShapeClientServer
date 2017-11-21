package shape;

/**
 *@author Ashley 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.LinkedList;

public class Main extends Object implements Serializable {

	
	private static final long serialVersionUID = -92491775749786151L;
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static LinkedList<Shape> shapes = new LinkedList<Shape>();

	public static void printMenu() {
		System.out.println("1. Create 2D");
		System.out.println("2. Create 3D");
		System.out.println("3. Send");
		System.out.println("4. Receive");
		System.out.println("5. Exit");
		System.out.print("> ");
	}

	public static void print2dMenu() {
		System.out.println("1. Create a circle");
		System.out.println("2. Create a rectangle");
		System.out.println("3. Create a triangle");
		System.out.println("4. Go to main menu");
		System.out.print("> ");
	}

	public static void print3dMenu() {
		System.out.println("1. Create a Sphere");
		System.out.println("2. Create a Cylinder ");
		System.out.println("3. Go to main menu");
		System.out.print("> ");
	}

	public static void printResult(LinkedList<Shape> result) {

		for (final Shape shape : result) {
			shape.displayDescrpition();
			
			if (shape instanceof TwoDShapes) {
				TwoDShapes twodshape = (TwoDShapes) shape;
				System.out.println("Area: " + twodshape.getArea());
				System.out.println("Perimiter:" + twodshape.getPerimiter());

			} else {
				ThreeDShapes threeshape = (ThreeDShapes) shape;
				System.out.println("Surface: " + threeshape.getSurface());
				System.out.println("Voume: " + threeshape.getvolume());
			}
			System.out.println("");

		}
	}

	public static Circle createCircle() {
		System.out.println("Create a circle");
		System.out.print("Name > ");
		String name = "";
		try {
			name = br.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		if ("".equals(name)) {
			System.out.println("[ERROR] Enter the name correctly");
			return null;
		}

		System.out.print("Radius > ");
		String strRadius = "";
		try {
			strRadius = br.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		if ("".equals(strRadius)) {
			System.out.println("[ERROR] Enter the radius correctly");
			return null;
		}

		try {
			Double radius = Double.valueOf(strRadius);
			Circle c = new Circle(name, radius);

			return c;
		} catch (Exception e) {
			System.out.println("[ERROR] Radius should be a double.");
		}

		return null;
	}

	public static Rectangle createRectangle() {
		System.out.println("Create a Rectangle");
		System.out.print("Name > ");
		String name = "";
		try {
			name = br.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		if ("".equals(name)) {
			System.out.println("[ERROR] Enter the name correctly");
			return null;
		}

		System.out.print("width > ");
		String strWidth = "";
		try {
			strWidth = br.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		if ("".equals(strWidth)) {
			System.out.println("[ERROR] Enter the width correctly");
			return null;
		}

		System.out.print("height > ");
		String strHeight = "";
		try {
			strHeight = br.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		if ("".equals(strHeight)) {
			System.out.println("[ERROR] Enter the height correctly");
			return null;
		}

		try {
			Double height = Double.valueOf(strHeight);
			Double width = Double.valueOf(strWidth);
			Rectangle r = new Rectangle(name, width, height);

			return r;
		} catch (Exception e) {
			System.out.println("[ERROR] width or height should be a double.");
		}

		return null;
	}

	public static Triangle createTriangle() {
		System.out.println("Create a Triangle");
		System.out.print("Name > ");
		String name = "";
		try {
			name = br.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		if ("".equals(name)) {
			System.out.println("[ERROR] Enter the name correctly");
			return null;
		}

		System.out.print("width > ");
		String strWidth = "";
		try {
			strWidth = br.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		if ("".equals(strWidth)) {
			System.out.println("[ERROR] Enter the width correctly");
			return null;
		}

		System.out.print("height > ");
		String strHeight = "";
		try {
			strHeight = br.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		if ("".equals(strHeight)) {
			System.out.println("[ERROR] Enter the height correctly");
			return null;
		}

		try {
			Double height = Double.valueOf(strHeight);
			Double width = Double.valueOf(strWidth);
			Triangle t = new Triangle(name, width, height);

			return t;
		} catch (Exception e) {
			System.out.println("[ERROR] width or height should be a double.");
		}

		return null;
	}

	public static Sphere createSphere() {
		System.out.println("Create a Sphere");
		System.out.print("Name > ");
		String name = "";
		try {
			name = br.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		if ("".equals(name)) {
			System.out.println("[ERROR] Enter the name correctly");
			return null;
		}

		System.out.print("Radius > ");
		String strRadius = "";
		try {
			strRadius = br.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		if ("".equals(strRadius)) {
			System.out.println("[ERROR] Enter the radius correctly");
			return null;
		}

		try {
			Double radius = Double.valueOf(strRadius);
			Sphere s = new Sphere(name, radius);

			return s;
		} catch (Exception e) {
			System.out.println("[ERROR] Radius should be a double.");
		}

		return null;
	}

	public static Cylinder createCylinder() {
		System.out.println("Create a Cylinder");
		System.out.print("Name > ");
		String name = "";
		try {
			name = br.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		if ("".equals(name)) {
			System.out.println("[ERROR] Enter the name correctly");
			return null;
		}

		System.out.print("radius > ");
		String strRadius = "";
		try {
			strRadius = br.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		if ("".equals(strRadius)) {
			System.out.println("[ERROR] Enter the width correctly");
			return null;
		}

		System.out.print("height > ");
		String strHeight = "";
		try {
			strHeight = br.readLine();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		if ("".equals(strHeight)) {
			System.out.println("[ERROR] Enter the height correctly");
			return null;
		}

		try {
			Double height = Double.valueOf(strHeight);
			Double radius = Double.valueOf(strRadius);
			Cylinder c = new Cylinder(name, radius, height);

			return c;
		} catch (Exception e) {
			System.out.println("[ERROR] radius or height should be a double.");
		}

		return null;
	}

	public static void main(String args[]) {
		String serverName = "localhost";
		int port = Integer.parseInt("6066");
		ObjectOutputStream out = null;
		ObjectInputStream in = null;
		Socket client = null;
		try {
			client = new Socket(serverName, port);
		} catch (UnknownHostException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		try {
			out = new ObjectOutputStream(client.getOutputStream());
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			in = new ObjectInputStream(client.getInputStream());
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		while (true) {
			printMenu();
			try {
				String line = br.readLine();
				if ("1".equals(line)) { // create 2d
					while (true) {
						print2dMenu();
						String sline = br.readLine();

						if ("1".equals(sline)) { // create a circle
							Circle c = createCircle();
							shapes.add(c);
						} else if ("2".equals(sline)) { // create a rectangle
							Rectangle r = createRectangle();
							shapes.add(r);
						}

						else if ("3".equals(sline)) { // create a triangle
							Triangle t = createTriangle();
							shapes.add(t);
						}

						else if ("4".equals(sline)) { // quit from here
							break;
						} else {
							System.out.println("\n[ERROR] Wrong command!\n");
						}
					}
				} else if ("2".equals(line)) { // create 3d
					while (true) {
						print3dMenu();
						String sline = br.readLine();

						if ("1".equals(sline)) { // create a Sphere
							Sphere s = createSphere();
							shapes.add(s);
						} else if ("2".equals(sline)) { // create a Cylinder
							Cylinder c = createCylinder();
							shapes.add(c);
						}

						else if ("3".equals(sline)) { // quit from here
							break;
						} else {
							System.out.println("\n[ERROR] Wrong command!\n");
						}
					}
				} else if ("3".equals(line)) { // send

					try {
						
						Command cmd = null;
						cmd = new Command();
						cmd.cmd_type = "save";
						cmd.data = shapes;

						System.out.println("Send, shapes count : " + shapes.size());
						
						out.writeObject(cmd);
						out.flush();
						out.reset();

					} catch (Exception e) {
						e.printStackTrace();
						System.out.println(e);
					}
				} else if ("4".equals(line)) { // receive
					System.out.println("Select shape type (R, C, T, A, Y, S) !");
					System.out.print("> ");
					String shapeType = "";
					try {
						shapeType = br.readLine();
					} catch (IOException e1) {
						e1.printStackTrace();
					}

					if (!(shapeType.equals("R") || shapeType.equals("C") || shapeType.equals("T")
							|| shapeType.equals("A"))) {
						System.out.println("\n[ERROR] Wrong command !");
						continue;
					}

					try {

						Command cmd = null;
						cmd = new Command();
						cmd.cmd_type = shapeType;
						cmd.data = null;

						out.writeObject(cmd);
						out.flush();
						out.reset();

						LinkedList<Shape> result = (LinkedList<Shape>) in.readObject();

						printResult(result);
						// close resources

					} catch (Exception e) {
						e.printStackTrace();
						System.out.println(e);
					}
				} else if ("5".equals(line)) { // exit
					break;
				} else {
					System.out.println("\n[ERROR] Wrong command!\n");
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		try {
			out.close();
			client.close();
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

	}
}

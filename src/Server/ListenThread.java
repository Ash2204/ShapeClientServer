package server;

/**
 * 
 * @Author Ashley
 */
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ListenThread implements Runnable {
	
	private int port = 6066;
	private ServerSocket serverSocket = null;
	private int clientCount = 0;
	
	private ArrayList<ClientThread> clients = new ArrayList<ClientThread>();
	
	@Override
	public void run() {
		
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("[Error] Port is already binded");
		} 
		
		System.out.println(Server.getTime() + " server waiting . . .");
		
		while(true) {
			Socket socket = null;
			try {
				socket = serverSocket.accept();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("[Error] Can't accept client connection.");
			} 
			
			clientCount ++;
			InetAddress clientAddress = socket.getInetAddress();
			System.out.println(Server.getTime() + " client attept from /" + clientAddress + ", client id = " + clientCount );
			
			ClientThread clientThread = new ClientThread(socket, clientCount);
			clients.add(clientThread);
			
			clientThread.start();
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void close()
	{
		try {
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


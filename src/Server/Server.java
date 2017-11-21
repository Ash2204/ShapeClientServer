package server;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

import shape.Shape;

public class Server extends Object implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 291676490952641572L;
	public static LinkedList<Shape> shapes = new LinkedList<Shape>();

	public static void main(String[] args) {
		
		try {
			
			Thread thread = new Thread(new ListenThread());
			thread.start();
			thread.join();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getTime() {
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]"); 
		return f.format(new Date());
	}

}



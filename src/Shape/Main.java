package shape;

/**
 *@auther Ashley 
 */


public class Main extends Object implements Serializable {

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

	
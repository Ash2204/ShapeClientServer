package shape;

import java.io.Serializable;

/**
 *
 * @author Ashley
 */
public abstract class Shape extends Object implements Serializable {

	private static final long serialVersionUID = 4844740341402349850L;
	final int _numberOfSides;
	final String _name;

	public Shape(int numberOfSides, String name) {
		_numberOfSides = numberOfSides;
		_name = name;
	}

	/*
	 * public abstract double getArea();
	 * 
	 * public abstract double getPerimiter();
	 */

	public void displayDescrpition() {
		System.out.println("I'm a shape name " + _name);
	}
}


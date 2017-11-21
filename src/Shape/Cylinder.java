package shape;

/**
 *@author Ashley 
 */

public class Cylinder extends ThreeDShapes {
	
	private static final long serialVersionUID = 5915967621854741473L;
	private final double _radius;
	private final double _height;

	public Cylinder(String name, double radius, double height ) {
		super(4, name);
		_radius = radius;
		_height = height;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSurface() {
		// TODO Auto-generated method stub
		return 2 * Math.pow(Math.PI, 2) + 2 * Math.PI * _radius * _height;
	}

	@Override
	public double getvolume() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(_radius, 2) * _height;
	}

}


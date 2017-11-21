package shape;

public abstract  class TwoDShapes  extends Shape  {

	/**
	 * 
	 */
	

	public TwoDShapes(int numberOfSides, String name) {
		super(numberOfSides, name);
		// TODO Auto-generated constructor stub
	}
	
	 public abstract double getArea();
	  
	 public abstract double getPerimiter();

}

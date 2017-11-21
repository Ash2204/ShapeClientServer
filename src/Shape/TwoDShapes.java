package shape;

/**
 *
 * @author Ashley
 */

public abstract  class TwoDShapes  extends Shape  {
	
                 private static final long serialVersionUID = 2606303875808957516L;
                 
	public TwoDShapes(int numberOfSides, String name) {
		super(numberOfSides, name);
		// TODO Auto-generated constructor stub
	}
	
	 public abstract double getArea();
	  
	 public abstract double getPerimiter();

}

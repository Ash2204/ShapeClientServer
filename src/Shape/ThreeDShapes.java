package shape;

public abstract class ThreeDShapes extends Shape  {

	/**
	 * @auther Ashley
	 */
	private static final long serialVersionUID = -3644095966436278837L;

	public ThreeDShapes(int numberOfSides, String name) {
		super(numberOfSides, name);
		// TODO Auto-generated constructor stub
	}

	 public void displayDescription(){
	        super.displayDescrpition();
	        System.out.println("\tI'm also a TwoDShapes");
	    }
	 
	 public abstract double getSurface ();
	  
	 public abstract double getvolume();
	 
	/*@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPerimiter() {
		// TODO Auto-generated method stub
		return 0;
	}
*/
}

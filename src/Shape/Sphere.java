package shape;

   /**
    * @auther Ashley 
    */

public class Sphere extends ThreeSections {
 
	private static final long serialVersionUID = 1049026575746486178L;
	private final double _radius;
    
	public Sphere( String name, double radius) {
		super(4, name);
		_radius = radius;
		// TODO Auto-generated constructor stub
	}

	  
    public void displayDescription(){
        super.displayDescrpition();
        System.out.println("I'm also a Sphere");
    }
    
	@Override
	public double getSurface() {
		// TODO Auto-generated method stub
		return 4*Math.pow(_radius, 2);
	}

	@Override
	public double getvolume() {
		// TODO Auto-generated method stub
		return 4*Math.pow(_radius, 3)/3;
	}

}


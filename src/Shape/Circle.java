package shape;

/**
 *
 * @author Ashley
 */
public class Circle extends TwoDShapes{
    
	private static final long serialVersionUID = -7024656029027547426L;
	private final double _radius;
    
    public Circle(String name, double radius) {
        super(1, name);
        _radius = radius;
    }
    
    public void displayDescription(){
        super.displayDescrpition();
    }
    
  /*  public double getArea() {
        return Math.PI * Math.pow(_radius, 2);
    }
    
    public double getPerimiter(){
        return Math.PI * (_radius * 2);
    }*/

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(_radius, 2);
	}

	@Override
	public double getPerimiter() {
		// TODO Auto-generated method stub
		return Math.PI * (_radius * 2);
	}
	
	@Override
	public String toString() 
	{
		return "i am Circle, named " + this._name + "With a radius of " + this._radius; 
	}
}


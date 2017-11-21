package shape;

/**
 *
 * @author Ashley
 */
public class Rectangle extends TwoDShapes {
    
                 private static final long serialVersionUID = -5138161872652033101L;
                 private final double _height;
                 private final double _width;

    public Rectangle(String name, double height, double width){
        super(4, name);
        _height = height;
        _width = width;
    }
    
   
    public void displayDescription(){
        super.displayDescrpition();
        System.out.println("\tI'm also a rectangle"); 
    }
   
   /* public double getArea(){
        return _height * _width;
    }
    
    public double getPerimiter(){
        return (_height + _width) * 2;
    }*/


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return _height * _width;
	}


	@Override
	public double getPerimiter() {
		// TODO Auto-generated method stub
		return (_height + _width) * 2;
	}
}


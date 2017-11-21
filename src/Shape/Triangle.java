package shape;

public class Triangle extends TwoDShapes {

    /**
     * @auther Ashley
     */
    
    private static final long serialVersionUID = 1651954022760024964L;
    private final double _side1;
    private final double _side2;
    private final double _side3;

    public Triangle(String name, double side1, double side2, double side3) {
        super(4, name);
        _side1 = side1;
        _side2 = side2;
        _side3 = side3;
        
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return (_side1 + _side2 + _side3) / 2;
    }

    @Override
    public double getPerimiter() {
        // TODO Auto-generated method stub
        return _side1 + _side2 + _side3;
    }
    @Override
    public String toString() 
    {
            return "i am Triangle, named " + this._name + ",with the following measurements:\nSides length:" + this._side1 + "," + this._side2 + "," + this._side3; 
    }
}

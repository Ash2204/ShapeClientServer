package shape;

public class Triangle extends TwoDShapes {

    /**
     * @auther Ashley
     */

    private final double _height;
    private final double _width;

    public Triangle(String name, double height, double width) {
        super(4, name);
        _height = height;
        _width = width;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return _height * _width / 2;
    }

    @Override
    public double getPerimiter() {
        // TODO Auto-generated method stub
        return _height + _width + Math.sqrt(Math.pow(_height, 2) + Math.pow(_width, 2));
    }

}

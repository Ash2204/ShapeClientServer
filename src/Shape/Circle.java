
package shape;

/**
 *
 * @author Ashley
 */
public class Circle extends Shape{
    
    private final double _radius;
    
    public Circle(String name, double radius) {
        super(1, name);
        _radius = radius;
    }
    
    public void displayDescription(){
        super.displayDescrpition();
        System.out.println("I'm also a circle");
    }
    
    public double getArea() {
        return Math.PI * Math.pow(_radius, 2);
    }
    
    public double getPerimiter(){
        return Math.PI * (_radius * 2);
    }
}

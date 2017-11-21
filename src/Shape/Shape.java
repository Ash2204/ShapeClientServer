package Shape;

import java.util.LinkedList;

/**
 *
 * @author Ashley
 */
public abstract class Shape {

    final int _numberOfSides;
    final String _name;

    public Shape(int numberOfSides, String name) {
        _numberOfSides = numberOfSides;
        _name = name;
    }

    public abstract double getArea();

    public abstract double getPerimiter();

    public void displayDescrpition() {
        System.out.println("I'm a shape name " + _name);
    }

    public static void main(String[] args) {

        final LinkedList<Shape> shapes = new LinkedList();

        shapes.add(new Rectangle("Rectangle one", 10, 8));
        shapes.add(new Rectangle("Rectangle two", 20, 5));
        shapes.add(new Circle("Circle one", 10));
        shapes.add(new Circle("Circle two", 20));

        for (final Shape shape : shapes) {
            shape.displayDescrpition();

            if (shape instanceof Circle) {
                System.out.println("Area: " + shape.getArea());
                System.out.println("Circumference:" + shape.getPerimiter());
            } else {
                System.out.println("Area: " + shape.getArea());
                System.out.println("Perimiter: " + shape.getPerimiter());
            }
            System.out.println("");
        }
    }
}

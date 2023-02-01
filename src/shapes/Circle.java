package shapes;

public class Circle {
    //       4.Circle class
//    Inside of src, create a directory named shapes. Inside of shapes, create a class named Circle. This class should have a private radius property that is set through the constructor, and various methods for getting information about the circle, detailed below.
//
//    public Circle(double radius)
//    public double getArea()
//    public double getCircumference()
//    Inside of shapes, create a class named CircleApp that prompts the user for the radius of the circle using your Input class, creates a Circle object, and displays the circumference and area. (Note that you will need to import your Input class.)
//
//    The formulas for circumference and area:
//
//    circumference = 2 x pi x radius
//    area = pi x (radius ^ 2)
//    For the value of pi, use the PI constant of the Math class.
    private double radius;
    double pi = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return pi * this.radius * this.radius;
    }
    public double getCircumference() {
        return 2 * pi * this.radius;
    }
}
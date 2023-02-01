package shapes;
//import util.Input;
import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Input input = new Input();
        System.out.print("What is the radius of this circle\n");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.printf("Area of circle = %f%n", circle.getArea());
        System.out.printf("Circumference of circle = %f%n", circle.getCircumference());

    }
}
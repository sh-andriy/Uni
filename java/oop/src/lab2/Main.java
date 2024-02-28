package lab2;
import lab2.models.Rectangle;
import lab2.models.Triangle;
import lab2.models.Shape;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length and width of the rectangle:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);

        System.out.println("Enter base and height of the right-angled triangle:");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        Triangle triangle = new Triangle(base, height);

        System.out.println("Area of the rectangle: " + rectangle.getArea());
        System.out.println("Area of the right-angled triangle: " + triangle.getArea());
    }
}

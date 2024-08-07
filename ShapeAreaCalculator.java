import java.util.*;

public class ShapeAreaCalculator {

    public float Area(float length, float width) {
        return (float) (length * width);
    }

    public double Area(double side) {
        return side * side;
    }

    public double Area(double base, double height) {
        return 0.5 * base * height;
    }

    public float Area(float radius){
        return (float) (Math.PI * radius * radius);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeAreaCalculator calculator = new ShapeAreaCalculator();

        try {
            // Calculate and display the area of rectangle
            System.out.println("Enter dimensions for the rectangle:");
            System.out.print("Length: ");
            float rectangleLength = scanner.nextFloat();
            System.out.print("Width: ");
            float rectangleWidth = scanner.nextFloat();
            System.out.printf("Area of rectangle: %.2f\n", calculator.Area(rectangleLength, rectangleWidth));

            // Calculate and display the area of a square
            System.out.println("\nEnter dimension for the square:");
            System.out.print("Side: ");
            double squareSide = scanner.nextDouble();
            System.out.printf("Area of square: %.2f\n", calculator.Area(squareSide));

            // Calculate and display the area of a triangle
            System.out.println("\nEnter dimensions for the triangle:");
            System.out.print("Base: ");
            double triangleBase = scanner.nextDouble();
            System.out.print("Height: ");
            double triangleHeight = scanner.nextDouble();
            System.out.printf("Area of triangle: %.2f\n", calculator.Area(triangleBase, triangleHeight));

            // Calculate and display the area of circle
            System.out.println("\nEnter radius of circle:");
            System.out.print("radius: ");
            float radius = scanner.nextFloat();
            System.out.printf("Area of circle: %.2f\n" ,calculator.Area(radius));

        }

        catch (Exception e) {
            System.out.println("Invalid input. Please enter numerical values.");
        }

        finally {
            scanner.close();
        }
    }
}

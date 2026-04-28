import java.util.Scanner;

// Step 1: Interface
interface Figure {
    void area();
}

// Step 2: Circle class
class Circle implements Figure {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

// Step 3: Rectangle class
class Rectangle implements Figure {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        double result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}

// Step 4: Square class
class Square implements Figure {
    double length;

    Square(double length) {
        this.length = length;
    }

    public void area() {
        double result = length * length;
        System.out.println("Area of Square: " + result);
    }
}

// Step 5: Triangle class
class Triangle implements Figure {
    double breadth, height;

    Triangle(double breadth, double height) {
        this.breadth = breadth;
        this.height = height;
    }

    public void area() {
        double result = 0.5 * breadth * height;
        System.out.println("Area of Triangle: " + result);
    }
}

// Step 6: Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        c.area();

        // Rectangle
        System.out.print("\nEnter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        Rectangle rect = new Rectangle(l, b);
        rect.area();

        // Square
        System.out.print("\nEnter side of square: ");
        double s = sc.nextDouble();
        Square sq = new Square(s);
        sq.area();

        // Triangle
        System.out.print("\nEnter breadth and height of triangle: ");
        double tb = sc.nextDouble();
        double th = sc.nextDouble();
        Triangle t = new Triangle(tb, th);
        t.area();

        sc.close();
    }
}
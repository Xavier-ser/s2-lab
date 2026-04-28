package mypack;

public class Circle implements Figure {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
}
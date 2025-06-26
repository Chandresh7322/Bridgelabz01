package OOPS.Constructors;
public class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);

        System.out.println("Circle 1 radius: " + c1.getRadius());
        System.out.println("Circle 1 area: " + c1.getArea());
        System.out.println("Circle 2 radius: " + c2.getRadius());
        System.out.println("Circle 2 circumference: " + c2.getCircumference());
    }
}

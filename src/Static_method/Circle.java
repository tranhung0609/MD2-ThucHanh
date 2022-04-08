package Static_method;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    private double getRadiu() {
        return radius;
    }

    double getArea() {
        return (this.radius * this.radius * Math.PI);
    }

    public static class TestCircle {
        public static void main(String[] args) {
            Circle circle = new Circle();
            System.out.println(circle.getRadiu());
            System.out.println(circle.getArea());
            circle.radius = 2;
            circle.color = "blue";
            System.out.println("%.2f" + circle.getArea());
        }
    }
}

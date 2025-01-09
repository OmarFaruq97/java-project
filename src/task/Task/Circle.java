package task.Task;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) throws NegativeNum {
        this.radius = radius;

        if (radius < 0) {
            throw new NegativeNum("Negative Number Not supported.");
        }
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return (Math.PI * radius * radius);
    }
}

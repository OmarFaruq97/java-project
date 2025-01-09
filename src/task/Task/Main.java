package task.Task;

public class Main {
    public static void main(String[] args) throws NegativeNum {

        try {
            Circle circle = new Circle(0);
            System.out.println("Circle: "+circle.calculateArea());

            Square square = new Square(5);
            System.out.println("Square: "+square.calculateArea());
            Rectangle rectangle = new Rectangle(-5,5.2);

            double display = rectangle.calculateArea();
            System.out.println("Rectangle: "+display);

        }catch (NegativeNum E){
            System.out.println(E.getMessage());
        }
    }
}

package task.Task;

public class Rectangle extends   Shape {

        private double height;
        private double width;

        public Rectangle(double height, double width) throws NegativeNum {
            this.height = height;
            this.width = width;

            if (height<0 || width<0){
                throw new NegativeNum("Negative Number Not supported.");
            }
        }

        @Override
        public double calculateArea() {
            return (width*height);
        }
    }



package task.Task;

public class Square extends Rectangle{

        public Square(double size) throws NegativeNum {
            super(size, size);
            if (size<0)
                throw new NegativeNum("Not supported");
        }
    }



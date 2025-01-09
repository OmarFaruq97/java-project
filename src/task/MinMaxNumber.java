package task;
import java.util.*;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double [] number = new double[5];

        System.out.println("Enter Random Numbers: ");

        for (int i=0; i<5; i++){
            number[i] = input.nextDouble();
        }

        double max = number[0];
        double min = number[0];

        for (int i=0; i<5; i++)
        {
            if(max<number[i]){
                max = number[i];
            }
            if (min >number[i]){
                min = number[i];
            }
        }
        System.out.println("The Highest number is: "+ max);
        System.out.println("The Lowest number is : "+ min);

        input.close();
    }
}

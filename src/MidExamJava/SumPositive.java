//question 1
package MidExamJava;
import java.util.*;

public class SumPositive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  sum = 0;
        int num;
        System.out.println("Enter integers ('when input negative number stop'): ");

        while (true) {
            num = scan.nextInt();
            if (num < 0) {
                break;
            }
            sum += num;
        }
        System.out.println(" Here the sum of positive integers is: " + sum);
        scan.close();
    }
}
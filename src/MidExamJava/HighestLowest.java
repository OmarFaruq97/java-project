//question 3
package MidExamJava;
import java.util.Scanner;

public class HighestLowest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Input third number: ");
        int num3 = scanner.nextInt();


        int highest = num1;
        int lowest = num1;


        if (num2 > highest) {
            highest = num2;
        }
        if (num3 > highest) {
            highest = num3;
        }


        if (num2 < lowest) {
            lowest = num2;
        }
        if (num3 < lowest) {
            lowest = num3;
        }

        System.out.println("\n");

        System.out.println("Your highest number is: " + highest);
        System.out.println("Your lowest number is: " + lowest);
        scanner.close();
    }
}


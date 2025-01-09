package SelfPrac;

import java.util.Scanner;

public class MinasInt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("first number: ");
        double sum1 = scanner.nextDouble();

        System.out.print("second number: ");
        double sum2 = scanner.nextDouble();

        double minus = sum1 - sum2 ;

        System.out.println("Answer: " + minus);

    }
}

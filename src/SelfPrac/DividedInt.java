package SelfPrac;

import java.util.Scanner;

public class DividedInt {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("first number: ");
        double num1 = scn.nextDouble();

        System.out.print("second number: ");
        double  num2 = scn.nextDouble();

        double divided = (double) num1 /num2;

        System.out.println("Answer: " + divided);
    }
}

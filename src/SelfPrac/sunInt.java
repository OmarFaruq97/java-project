package SelfPrac;

import java.util.Scanner;

public class sunInt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input Your first number: ");
        int num1 = sc.nextInt();

        System.out.print("Input second number: ");
        int num2 = sc.nextInt();

        int sum = num1+num2;

        System.out.println("Your Diser Number is= " + sum);
    }
}

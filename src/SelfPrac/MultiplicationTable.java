package SelfPrac;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scnnr = new Scanner(System.in);
        System.out.print("input number: ");
        int num = scnnr.nextInt();

        for (int i = 0; i < 10; i++){
            System.out.println(num + " X " + (i+1) + "= " + (num *(i+1)));
        }
        //num1 + " x " + (i + 1) + " = " + (num1 * (i + 1))

    }
}

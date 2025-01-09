package ThirdClass;

import java.util.Scanner;

public class TernariOperator {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your First Number : ");
        System.out.println("Enter Your Second Number : ");


        int numberOne = sc.nextInt();
        sc.nextLine();
        int numberTwo = sc.nextInt();
        sc.nextLine();
        int max;




        System.out.println("First num: " + numberOne);
        System.out.println("Second num: " + numberTwo);

        max = (numberOne > numberTwo) ? numberOne : numberTwo;

        System.out.println("maximaum is = "+ max);
    }
}

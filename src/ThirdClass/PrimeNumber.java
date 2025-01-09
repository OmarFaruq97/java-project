package ThirdClass;

import java.util.Scanner;

public class PrimeNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your desire number : ");

        int prime = sc.nextInt();

        if (prime % 2 == 0){
            System.out.println("Your number is Prime Number");
        }
        else{
            System.out.println("This is not Prime number");
        }

    }
}

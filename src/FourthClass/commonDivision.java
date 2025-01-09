package FourthClass;

import java.util.Scanner;

public class commonDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your First Number : ");
        int n1 = input.nextInt();

        System.out.println("Enter Your Second Number");
        int n2 =  input.nextInt();

        int gcd =1 ;
        int k = 2;
        while (k <= n1 && k<= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }
        System.out.println("The Greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }
}
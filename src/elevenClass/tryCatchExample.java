package elevenClass;

import java.util.Scanner;

public class tryCatchExample {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter First Number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter Second Number: ");
            int num2 = sc.nextInt();

            int result = num1/num2;
            System.out.println("The result is: "+ result);
        }catch (Exception e){
            System.out.println(e);

        }
    }


}

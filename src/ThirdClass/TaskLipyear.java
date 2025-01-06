package ThirdClass;

import java.util.Scanner;

public class TaskLipyear {

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter Your Year : ");

        int year = sc.nextInt();

        if (year % 4 == 0 && year % 400!= 0){
            System.out.println("The year is lipyear");
        }
        else {
            System.out.println("The year is not lip year");
        }
        sc.close();
    }
}

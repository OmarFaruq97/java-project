//question 4
package MidExamJava;
import java.util.*;

public class GradeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your marks: ");

        int marks = scan.nextInt();

        if (marks<0 || marks>100) {
            System.out.println("Your input is invalid.");
        }
        else if (marks >= 90 && marks <=100) {
            System.out.println("Your Grade is : A+");
        } else if (marks >= 70 && marks<90) {
            System.out.println("Your Grade is: A");
        } else if (marks >= 60 && marks<70) {
            System.out.println("Your Grade is: B");
        } else if(marks>=0 ) {
            System.out.println("Your are Failed.");
        }
        scan.close();
    }
}

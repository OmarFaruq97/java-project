package secondClass;

import java.util.Scanner;

public class ifelselogic {
    public static void main(String[] args) {
        Scanner gr = new Scanner(System.in);

        System.out.println("Enter your mark: ");
        int mark = gr.nextInt();

        if (mark >= 0 && mark <= 100) {

            if (mark >= 80) {
                System.out.println("You got A+");
            } else if (mark >= 60) {
                System.out.println("You got A");
            } else if (mark >= 40) {
                System.out.println("You got B");
            } else {
                System.out.println("You got C");
            }
        } else {
            System.out.println("Invalid mark entered. Please enter a mark between 0 and 100.");
        }
        gr.close();
    }
}

package secondClass;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter an Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your school name: ");
        String school = scanner.nextLine();


        System.out.println("Hi Mr: " + name + "! You are " + age + " years old. And your school name is " + school);
        System.out.println();
    }

}

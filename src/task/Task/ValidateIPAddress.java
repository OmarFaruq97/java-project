package task.Task;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static void main(String[] args) {
        // Test IP addresses
        Scanner scanner = new Scanner(System.in);
        String choice;

        System.out.println("Welcome to the IP Address Validator!");

        do {
            System.out.print("Enter an IP address to validate: ");
            String ip = scanner.nextLine();

            if (Pattern.matches(MyRegex.pattern, ip)) {
                System.out.println(ip + " is a valid IP address.");
            } else {
                System.out.println(ip + " is Invalid IP address.");
            }

            // Ask the user if they want to validate another IP
            System.out.print("Do you want to validate another IP address? (yes/no): ");
            choice = scanner.nextLine().trim().toLowerCase();
        } while (choice.equals("yes"));

        System.out.println("Program exited. Thank you!");
        scanner.close();
    }
}

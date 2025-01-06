package SeventhClass;
import java.util.Scanner;


public class calcultor {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter Number : ");
        String input = scnr.nextLine();

        String[] parts = input.split("(?=[-+*/%])|(?<=[-+*/%])");
        if (parts.length != 3) {
            System.out.print("vhul input");
            scnr.close();
            return;
        }
        double num1 = Double.parseDouble(parts[0].trim());
        char operator = parts[1].trim().charAt(0);
        double num2 = Double.parseDouble(parts[2].trim());

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.print("vhul input.");
                    scnr.close();
                    return;
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.print("vhul input.");
                    scnr.close();
                    return;
                }
                break;
            default:
                System.out.print("invalid operator.");
                scnr.close();
                return;
        }
        System.out.print("Answer = " + result);
        scnr.close();
    }
}
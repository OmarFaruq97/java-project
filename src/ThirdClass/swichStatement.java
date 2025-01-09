package ThirdClass;

import java.util.Scanner;

public class swichStatement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day :");
        String day = sc.next();

        switch (day) {
            case "Sunday":
                System.out.println("aj robibar");
                break;
            case "Monday":
                System.out.println("aj sombar");
                break;
            case "Tuesday":
                System.out.println("aj mongolbar");
                break;
            case "Wednesday":
                System.out.println("aj budbar");
                break;
            case "Thursday":
                System.out.println("aj brihospotibar");
                break;
            case "Friday":
                System.out.println("aj sukrobar");
                break;
            case "Saturday":
                System.out.println("aj sonibar");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}

package hW;

import java.util.Objects;
import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Username: ");
        String username = input.nextLine();
        System.out.print("Enter Your Password: ");
        String password = input.nextLine();

        try {
            username(username);
            password(password);
            System.out.println("|>>  Hello Your are Welcome our Home, " + username + "   |"); //if correct show greeting.

        } catch (customException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            input.close();
        }
    }

    private static void username(String username) {
        String actualUsername = "OMAR"; //correct username
        if (!Objects.equals(username, actualUsername)) {
            throw new customException("incorrect username!");
        }
    }
    public static void password(String password) {
        String actualPassword = "isdb62"; //correct password
        if (!Objects.equals(password, actualPassword)) {
            throw new customException("incorrect password!");
        }
    }

    public static class customException extends RuntimeException {
        public customException(String message) {
            super(message);
        }
    }
}

package SixthClass;

import java.util.Random;

public class passwordGenaret {

    public static void main(String[] args) {
        System.out.println("Generated password: " + generatePassword());
    }

    public static String generatePassword() {

        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()-_+=<>?";
        String allChars = upperCase + lowerCase + digits + specialChars;

        Random rndm = new Random();

        StringBuilder pswrd = new StringBuilder();

        pswrd.append(upperCase.charAt(rndm.nextInt(upperCase.length())));
        pswrd.append(specialChars.charAt(rndm.nextInt(specialChars.length())));
        pswrd.append(lowerCase.charAt(rndm.nextInt(lowerCase.length())));
        pswrd.append(digits.charAt(rndm.nextInt(digits.length())));

        for (int i = pswrd.length(); i < 4; i++) {
            pswrd.append(allChars.charAt(rndm.nextInt(allChars.length())));
        }
        for (int i = 0; i < pswrd.length(); i++) {
            int j = rndm.nextInt(pswrd.length());
            char temp = pswrd.charAt(i);
            pswrd.setCharAt(i, pswrd.charAt(j));
            pswrd.setCharAt(j, temp);
        }
        return pswrd.toString();
    }
}
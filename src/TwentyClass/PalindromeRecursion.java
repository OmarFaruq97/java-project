package TwentyClass;

import java.util.Scanner;

public class PalindromeRecursion {
    public static boolean isPalindrome(String name, int start, int end){
        char iqram = name.charAt(start);
        char hemel = name.charAt(end);

        if (start >= end)
            return true;

        if (iqram != hemel)
            return false;
        else
            return isPalindrome(name,start +1,end-1 );
    }
        public static void main(String[] args) {
         String s = new String("Noeon");

                System.out.println("\"" + s + "\" is a palindrome.");
            }

        }
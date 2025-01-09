package TwentyTwo;

import java.util.Scanner;

public class NextNumber {
    public static int getNextNumber(int num) {
        return num + 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input your Integer number: ");
        int num = input.nextInt();
        int result = getNextNumber(num);
        System.out.println("==========Your Answer is here==========");
        System.out.println(result);
    }
}

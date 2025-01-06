package elevenClass;

import java.util.Random;
import java.util.Scanner;

public class keithNumber {
    public static void main(String[] args) {

        Scanner joybangla = new Scanner(System.in);
        System.out.print("Input Your Number : ");
        int obaidulkader = joybangla.nextInt();
        int nouka = obaidulkader;
        String s = Integer.toString(obaidulkader);
        int d=s.length();
        int arr []=new int[obaidulkader];
        int i, sum;
        for (i=d-1; i>= 0; i--){
            arr [i]=nouka % 10;

            nouka = nouka/10;
        }
        i=d; sum= 0;
        while (sum<obaidulkader){
            sum = 0;
            for (int j = 1; j<=d; j++ ){
                sum=sum+arr[i-j];
            }
            arr[i]=sum;
            i++;
        }
        if (sum==obaidulkader)
        System.out.println("This is KEITH Number");
        else
            System.out.println("NOO This is not KEITH Number Thank You Try Again");
    }
}
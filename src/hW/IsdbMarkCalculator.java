package hW;

import java.util.Scanner;

public class IsdbMarkCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Mid-Month
        System.out.print("Enter Mid-Monthly External Marks: ");
        int midMonExt = input.nextInt();
        System.out.print("Enter Mid-Monthly Evidence: ");
        int midMonEvi = input.nextInt();
        //Here Mid-Monthly Summation Between External and Evidence
        double midTotal = midMonExt + midMonEvi;

        //Here Calculation 20% Marks on Mid-Month
        double newMidMonExt = midMonExt *((double) 20/100);
        double newMidMonEvi = midMonEvi * ((double) 20/100);

        //Here Monthly
        System.out.print("Enter Monthly External Marks: ");
        int monExt = input.nextInt();
        System.out.print("Enter Monthly Evidence Marks: ");
        int monEvi = input.nextInt();
        double monthTotal = monExt + monEvi;

        //Here Calculation 80% Marks
        double newMonExt = monExt * ((double) 80/100);
        double newMonEvi = monEvi * ((double) 80/100);

        //Here Total of (External and Evidence)
        double extTotal = newMonExt + newMidMonExt;
        double eviTotal = newMonEvi + newMidMonEvi;
        double grandTotal = eviTotal + extTotal;

        String status;
        if (extTotal >= 30 && eviTotal >= 30) {
            status = "Passed";
        }
        else {status = "Failed";
        }

        //Here Final Output
        System.out.println("******************************************************************");
        System.out.println("Mid-Monthly Marks: " + midMonExt + "(External)" + " & " + midMonEvi + "(Evidence)" + midTotal + "(Total)");
        System.out.println("Monthly Marks: " + monExt + "(External)" + " & " + monEvi + "(Evidence)" + monthTotal + "(Total)");

        System.out.println("******************************************************************");

        System.out.println("Final Score: "
                + Math.round(extTotal)
                +"(" + Math.round(newMidMonExt) + " + " + Math.round(newMidMonEvi) + ")" + "(External)" + " + "
                + Math.round(eviTotal)
                + "(" + Math.round(newMidMonEvi)+ "+" + Math.round(newMonEvi) + ")" + "(Evidence)"
                + "=" + Math.round(grandTotal) + "(Total)");

        System.out.println("Status: " + status);
    }
}
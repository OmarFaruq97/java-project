/*package ThirdClass;
import java.util.Scanner;
public class ComputeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        int status = input.nextInt();

        System.out.print("Enter the Taxable income");
        double income = input.nextDouble();

        double tax = 0;

        if (status == 0) ;

        if (income <= 8350) {
            tax = income * 0.10;
        } else if (income <= 33950) {
            tax = 8350 * 0.10 + (income - 5350) * 0.15;
        } else if (income <= 82250) {
            tax = 8350 * .10 + (33950 - 8350) * .15 + (income - 33950) * 0.25;
        } else if (income <= 171550) {
            tax = 8350 * .10 + (33950 - 8350) * .15 + (82250 - 33950) * (income - 82250) * 0.28;
        } else if (income <= 372950) {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                    (82250 - 171550) * 0.33;
        } else {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                    (82250 - 33950) * 0.25 + (income - 372950) * 0.35;
        }
        else if (status ==1)
        else if (status ==2)
        else if (status ==3)

        else {
            System.out.println("Error : valid status");
            System.exit(1);
        }
        System.out.println("Tax is" + (int)(tax*100) /100.0);
    }

    }
*/
package ThirdClass;
import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your filing status (0 - Single, 1 - Married, 2 - Head of Household, 3 - Invalid):");
        int status = input.nextInt();


        System.out.print("Enter the Taxable income: ");
        double income = input.nextDouble();

        double tax = 0;


        if (status == 0) {
            if (income <= 8350) {
                tax = income * 0.10;
            } else if (income <= 33950) {
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            } else if (income <= 82250) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            } else if (income <= 171550) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            } else if (income <= 372950) {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
            } else {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
            }
        } else if (status == 1) {

            if (income <= 16700) {
                tax = income * 0.10;
            } else if (income <= 67900) {
                tax = 16700 * 0.10 + (income - 16700) * 0.15;
            } else if (income <= 164500) {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
            } else if (income <= 331050) {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (164500 - 67900) * 0.25 + (income - 164500) * 0.28;
            } else {
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (164500 - 67900) * 0.25 + (331050 - 164500) * 0.28 + (income - 331050) * 0.33;
            }
        } else if (status == 2) {

            if (income <= 11950) {
                tax = income * 0.10;
            } else if (income <= 45500) {
                tax = 11950 * 0.10 + (income - 11950) * 0.15;
            } else if (income <= 117450) {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (income - 45500) * 0.25;
            } else if (income <= 190200) {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (income - 117450) * 0.28;
            } else {
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (income - 190200) * 0.33;
            }
        } else {
            System.out.println("Error: Invalid status.");
            System.exit(1);
        }

        // Correcting output to display tax correctly
        System.out.println("Tax is: $" + String.format("%.2f", tax));
    }
}



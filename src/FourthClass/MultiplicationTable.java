package FourthClass;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("\t\t\tMultiplication Table");

        System.out.print("\t\t");
        for (int j = 1; j <= 9; j++)
            System.out.print("\t " + j);
        System.out.println("\n---------------------------------------------------");
        int i;
        for (i = 1; i <= 9; i++) {
            ;
            System.out.print(i + "  |  ");
            for (int k = 1; k <= 9; k++) {
                System.out.printf("%4d ", i * k);
            }
            System.out.println();
        }
    }
}

package task;

public class avgValueOfArray {
    public static void main(String[] args) {
        int[] num = new int[]{10, 20, 30, 40, 50, -16, -100};

        int sum = 0;
        for (int j : num) {
            sum = sum + j;
        }

        double average = (double) sum / num.length; // double average = sum / numbers.length;
        System.out.println("Average value of Array elements is = " + average);
    }
}

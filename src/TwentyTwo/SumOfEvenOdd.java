package TwentyTwo;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        int [] array = {1,3,5,7,9,2,4,6,8,10};
        calculateAndDisplaySums(array);
    }
    private static void calculateAndDisplaySums(int[] array) {
        int evenSum =0;
        int oddSum = 0;

        for (int num : array){
            if ( num % 2 == 0){
                evenSum += num;
            }else {
                oddSum += num;
            }
        }
        System.out.println("The even number is: "+evenSum);
        System.out.println("The odd number is: "+oddSum);
        System.out.println("The difference between number: "+(evenSum-oddSum));
    }

}

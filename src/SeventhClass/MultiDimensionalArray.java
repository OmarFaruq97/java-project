package SeventhClass;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[]primeNumber = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
        };
        System.out.println(Arrays.toString(primeNumber));

        int[]copyOfPrimeNumber =Arrays.copyOf(primeNumber, primeNumber.length);
        System.out.println(Arrays.toString(copyOfPrimeNumber));

    }
}
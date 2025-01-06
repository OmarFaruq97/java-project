package task;

public class duplicateValuesArray {
    public static void main(String[] args) {
        int [] num = {10,20,25,30,30,40,50,10};

        for (int i = 0; i < num.length -1 ; i++){
            for (int sum = i+1; sum<num.length; sum++) {
                if ((num[i] == num[sum]) && (i !=sum)) {
                    System.out.println("Duplicate values of an array of integer value is = " + num[sum]);
                }
            }
        }
    }
}
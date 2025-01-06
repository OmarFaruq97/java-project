package FourthClass;

public class whileLOOP {
    public static void main(String[] args) {
        int sum =2, i = 2;

        while(i<=5){
            System.out.println(i);
            sum = sum+i;
            i++;
        }
        System.out.println("sum is " + sum);
    }
}
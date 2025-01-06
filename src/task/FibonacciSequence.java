package task;

public class FibonacciSequence {
    public static long fibonacci (long n) {
        if (n <= 1)
        {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args){
        int n = 5;
        System.out.println("Fibonacci "+n+" terms: ");
        for (int i = 0; i<=n; i++)
        {
            System.out.println(fibonacci(i) + " ");
        }
    }
    }







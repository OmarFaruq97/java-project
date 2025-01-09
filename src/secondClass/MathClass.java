package secondClass;

public class MathClass {
    public static void main (String[] args){
        int abs = Math.abs(-98);
        System.out.println(abs);

        double pow = Math.pow(2, 3);
        System.out.println(pow);

        double ceil = Math.ceil(123.1234);
        System.out.println(ceil);

        double floor = Math.floor(123.1234);
        System.out.println(floor);

        long round = Math.round(123.1234);
        System.out.println(round);

        double random = Math.random();
        System.out.println(random);

        int caseInt =(int)(random*100.5);
        System.out.println(caseInt);

    }

    }

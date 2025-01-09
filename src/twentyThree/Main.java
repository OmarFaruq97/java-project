package twentyThree;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee ep1 = new Employee
                ("Faruk", LocalDate.of(1994, 1, 1), "Mirpur, Dhaka");

        System.out.println("Name\tYear of joining\t\tAddress");


        System.out.println(ep1.toString());

    }
}

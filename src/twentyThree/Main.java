package twentyThree;

// Import Employee class from the appropriate package
import TwenrtOne.Employee1;

import java.time.LocalDate;

public class Main {
    // Static Employee objects to allow access within the static main method
    public static void main(String[] args) {

       /* Employee employee1 = new Employee("Robert", LocalDate.of(1994, 1, 1), "64C- WallsStreat");
        Employee employee2 = new Employee("Sam", 2000, "68D- WallsStreat");
        Employee employee3 = new Employee("John", 1999, "26B- WallsStreat");*/

        Employee ep1 = new Employee("Faruk", LocalDate.of(1994, 1, 1), "Mirpur, Dhaka");
        // Print header
        System.out.println("Name\tYear of joining\t\tAddress");

        // Print employee information
        System.out.println(ep1.toString());
       /* System.out.println(employee2.toString());
        System.out.println(employee3.toString());*/
    }
}

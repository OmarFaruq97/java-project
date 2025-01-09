package twentyThree; // Corrected package name

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate yearOfJoining;
    private String address;

    // Constructor
    public Employee(String name, LocalDate yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for yearOfJoining
    public LocalDate getYearOfJoining() {
        return yearOfJoining;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Optional: toString method for easy object representation
    @Override
    public String toString() {
        return name + "\t" + yearOfJoining + "\t\t" + address;
    }
}

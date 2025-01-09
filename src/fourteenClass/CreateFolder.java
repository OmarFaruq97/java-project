package fourteenClass;
import java.io.*;

public class CreateFolder {
    public static void main(String[] args) {
        File f = new File("C:\\Educative");


        if (f.mkdir()) {
            System.out.println("Directory has been created successfully");
        } else {
            System.out.println("Directory cannot be created");
        }
        File directories = new File("C:\\Omar\\Picture\\My Pic\\School");

        if (f.mkdir()) {
            System.out.println("Directory has been created successfully");
        } else {
            System.out.println("Directory cannot be created");
        }

        if (directories.mkdirs()) {
            System.out.println("Directories created successfully!");
        } else {
            System.out.println("Failed to create directories or they already exist.");
        }

    }
}

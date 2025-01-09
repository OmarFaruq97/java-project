package task;

import java.io.File;

public class fileSize {
    public static void main(String[] args) {
     //   File file = new File("U:\intranet_root\intranet\R1112B2.zip");


      //  long fileSizeInBytes = file.length();

       // String filePath = "example.txt";


        String filePath = "C:\\Users\\Java Student2\\Desktop\\1285325\\Java\\ClassTwo\\src\\task";

        // Create a File object
        File file = new File(filePath);

        // Check if the file exists
        if (file.exists() && file.isFile()) {
            // Get the file size in bytes
            long fileSizeInBytes = file.length();

            // Convert file size to KB and MB
            double fileSizeInKB = fileSizeInBytes / 1024.0;
            double fileSizeInMB = fileSizeInKB / 1024.0;

            // Display the file size in different units
            System.out.println("File Size:");
            System.out.println("Bytes: " + fileSizeInBytes + " B");
            System.out.printf("Kilobytes: %.2f KB%n", fileSizeInKB);
            System.out.printf("Megabytes: %.2f MB%n", fileSizeInMB);
        } else {
            System.out.println("The file does not exist or is not a valid file.");
        }
    }
}

package task;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LastModified {
        public static void main(String[] args) {

            String filePath = "example.txt";
            File file = new File(filePath);
            if (file.exists()) {
                long lastModified = file.lastModified();


                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String formattedDate = sdf.format(lastModified);

                System.out.println("Last modified date of the file: " + formattedDate);
            }
            else {
                System.out.println("The file does not exist.");
            }
        }
    }



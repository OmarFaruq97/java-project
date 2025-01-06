package hW;
import java.net.URL;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.ArrayList;

public class WebCrawler {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Please Enter Your URL = ");
        String url = input.nextLine();

        crawler(url); //Traverse the web from the starting url
    }

    public static void crawler(String startingURL) {
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraversedURLs = new ArrayList<>();

        listOfPendingURLs.add(startingURL);
        while (!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <=100){
            String urlString = listOfPendingURLs.remove(0);
            if (!listOfTraversedURLs.contains(urlString)){
                listOfTraversedURLs.add(urlString);
                System.out.println("Craw" + urlString);


                for (String s : getSubURLs(urlString)){
                    if (!listOfTraversedURLs.contains(s))
                        listOfPendingURLs.add(s);
                }
            }
        }
    }
    //here i am use array
    public static  ArrayList<String> getSubURLs(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        //here would be some problem
        try {
            URL url= new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("http: " , current);
                while (current > 0) {
                    int endIndex = line.indexOf("\"", current);
                    if (endIndex > 0){
                        list.add(line.substring(current,endIndex));
                        current = line.indexOf("http: ", endIndex);
                    }
                    else current = -1;
                }
            }
        }
        catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        return list;
    }
}
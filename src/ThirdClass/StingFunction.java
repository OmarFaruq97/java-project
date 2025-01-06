package ThirdClass;

public class StingFunction {
    public static void main (String[] args){
        String name = "Iqram amar Bangldeshi bondhu";
        String anothername =("\t\t\t\tOmar\t   Faruq");
        String nameThree = "Iqram amar Bangldeshi bondhu";
        String nameFour = "Iqram amar Bangldeshi bondhu";

        System.out.println(name);
        System.out.println(anothername.trim().length());
        System.out.println(nameThree.substring( 3));
        System.out.println(nameThree.substring(3, 7));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        String nahid = "Senior";
        String Iqram = "Senior";

        System.out.println(nahid.equals(Iqram));
        System.out.println(nahid.equalsIgnoreCase(Iqram));

        String numString ="22";
        int convertedFromSting = Integer.parseInt(numString);
        System.out.println(convertedFromSting);
        System.out.println(convertedFromSting);


        String myString = "9Hello World!";
        if ( Character.isDigit(myString.charAt(0)) )
        {
            System.out.println("String begins with a digit");
        }

        }

    }


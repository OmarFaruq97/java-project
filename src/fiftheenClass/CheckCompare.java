package fiftheenClass;
import java.util.ArrayList;

public class CheckCompare {
    public static void main(String[] args) {
        ArrayList<String> messi = new ArrayList<>();

        messi.add("ONE");
        messi.add("TWO");
        messi.add("THREE");

        ArrayList<String> neymar = messi;
        neymar.add("FOUR");

        ArrayList<String> ronaldo = (ArrayList<String>)  messi.clone();

        System.out.println(messi);
        System.out.println(ronaldo);
    }
}
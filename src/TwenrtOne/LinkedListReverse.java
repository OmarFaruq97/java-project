package TwenrtOne;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListReverse {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Pink");
        list.add("Red");
        list.add("Yellow");
        list.add("Red");
        list.add("Green");


        for (Iterator<String> it = list.descendingIterator(); it.hasNext(); ) {
            String each = it.next();
            System.out.println(each);
        }
    }
}

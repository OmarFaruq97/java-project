package TwentyClass;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class CollectionFramework {
    public static void main(String[] args) {

        List<String> colors = Arrays.asList("RED", "blue", "GREEN");

        for (ListIterator<String> iterator = colors.listIterator(); iterator.hasPrevious(); )
        {
            String nextElement = iterator.previous();
            System.out.println(nextElement);

            if (Objects.equals(nextElement, "blue"))
            {
                iterator.set("BLUE");
            }
        }

        System.out.println("colors = " + colors);

        List<Integer> num = Arrays.asList(1, 2, 4);

        for (ListIterator<Integer> iterator = num.listIterator(); iterator.hasNext(); )
        {
            int nextElement = iterator.next();
            if (Objects.equals(nextElement, 4))
            {
                iterator.set(3);
            }
        }
        System.out.println("Number Integer is: " + num);
    }
}
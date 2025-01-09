package NinteenClass;

import java.util.ArrayList;

public class Generic {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("def");
        strings.add("ghi");
        strings.add("jkl");
        strings.add("mno");

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        System.out.println("Strings: " + strings);
        System.out.println("Integers: " + integers);
    }
}

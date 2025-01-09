package TwenrtOne;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> student = new HashMap<>();

        student.put("Younus", 56);
        student.put("kader", 75);
        student.put("Polok", 89);

        System.out.println(student);
    }
}

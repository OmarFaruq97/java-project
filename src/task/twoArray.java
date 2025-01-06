package task;

import java.util.Arrays;
import java.util.HashSet;

public class twoArray {
        public static void main(String[] args) {
            String[] array1 = {"Leo Messi", "Di Maria", "Omar", "Nahuel Molina", "Nicolas Otamendi", "Julian Alvarez"};
            String[] array2 = {"Toni Kroose", "Harry kane", "Omar", "Luca Modric", "Neymar", "Haaland", "M.Salah"};

            System.out.println("Array1 : " + Arrays.toString(array1));
            System.out.println("Array2 : " + Arrays.toString(array2));

            HashSet set = new HashSet();

            for (String s : array1) {
                for (String string : array2) {
                    if (s.equals(string)) {
                        set.add(s);
                    }
                }
            }
            System.out.println("Overall Common Name is : " + (set));
        }
    }
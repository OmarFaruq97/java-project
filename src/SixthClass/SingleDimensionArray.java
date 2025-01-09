

package SixthClass;

import java.util.Arrays;

public class  SingleDimensionArray {
    public static void main(String[] args) {
        int[] marks = new int[14];
        marks[0] = 5;
        marks[2] = 0;
        marks[13] = 23;

        System.out.println(marks[13]);

        System.out.println("Common Loop");
        for(int i= 0; i < marks.length ; i++){
            System.out.print(marks[i] + ", ");
        }

        System.out.println();
        System.out.println("For Each Loop");
        System.out.println("[");
        String st = "";
        for(int m : marks){
            //System.out.print(m + ", ");
        }
      for (int m : marks) {
        st = st + m + " ,";
    }

    st = st.substring (1, st.length() - 1);

        System.out.print(st);
        System.out.print("]");

        System.out.println();
        System.out.println("print with array class");
        System.out.println(Arrays.toString(marks));

    }
}

package hw3_1;

import java.util.Arrays;

public class ChangeElements { // Сделал так, до разбора дз на уроке.

    public  static <T> void changeElements (T[] argument) {

        T a = argument[0];
        argument[0] = argument[1];
        argument[1] = a;
        System.out.println(Arrays.toString(argument));
      

    }




    public static void main(String[] args) {

        String[] s = new String[]{"dd", "TWO", "fgh"};
        Integer[] i = new Integer[] {1, 3000, 4, 6};

        changeElements(s);
        changeElements(i);


    }




}

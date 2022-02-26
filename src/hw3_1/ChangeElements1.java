package hw3_1;

import java.util.Arrays;

public class ChangeElements1 <T> {



    public static  <T> void changeElements1(T[] array, int indexA, int indexB) {
        T variable;

        variable  = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = variable;
        System.out.println(Arrays.toString(array));
    }




}

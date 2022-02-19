package hw2;

public class StringArray {

    public static void main(String[] args) {

        String[][] myArray = new String[45][7];

        checkArray(myArray);
        System.out.print("This " + myArray.length + " by ");
        System.out.println(myArray[0].length);

        String[] myArrayStr = {"2", "7",  "oo"};
        checkArray(myArrayStr);


    }

    public static void checkArray(String array[][]) {
        try {

            if ((array.length != 4) | (array[0].length != 4)) {
                throw new MyArraySizeException();

            }

        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }


    }


    public static void checkArray(String array[]) {
        int a = 0;
        int b = 0;


        for (int i = 0; i < array.length; i++) {

            try {
                a = Integer.parseInt(array[i]);

            } catch (NumberFormatException e) {     // Выскакивает RuntimeException. Не смог его заменить
                e.printStackTrace();

            }
            b = b + a;

        }
        System.out.println(b);

    }



}












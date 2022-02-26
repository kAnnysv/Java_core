package hw3_1;

public class Main {
    static String[] s = new String[]{"dd", "TWO", "fgh"}; // Решение преподавателя.
    static Integer[] i = new Integer[] {1, 3000, 4, 6};

    public static void main(String[] args) {

        ChangeElements1 <Object>change = new ChangeElements1<>();
        try {
            change.changeElements1(s,0, 3);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        try {
            change.changeElements1(i,0, 3);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }







    }
}

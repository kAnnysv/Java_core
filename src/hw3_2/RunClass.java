package hw3_2;

import java.util.ArrayList;

public class RunClass {

    public static void main(String[] args) {
        ArrayList<Apple> applesList = new ArrayList<>(10);

        Apple apple0 = new Apple(1F);
        Apple apple1 = new Apple(1F);
        Apple apple2 = new Apple(1F);
        Apple apple3 = new Apple(1F);
        Apple apple4 = new Apple(1F);


        applesList.add(apple0);
        applesList.add(apple1);
        applesList.add(apple2);
        applesList.add(apple3);
        Box<Apple> box1 = new Box<>(applesList);

        ArrayList<Apple> applesList2 = new ArrayList<>();



        applesList2.add(apple0);
        applesList2.add(apple1);
        applesList2.add(apple2);
        applesList2.add(apple3);
        applesList2.add(apple4);

        Box<Apple> box2 = new Box(applesList2);

        System.out.println(box1.getWeightList());
        System.out.println(box2.getWeightList());
        System.out.println(box1.compareList(box2));
        box1.toEmptyList(box2);
//        toEmpty выдает ConcurrentModificationException

        ArrayList<Orange> orangeArrayList = new ArrayList<>(10);

        Orange orange0 = new Orange(1.5F);
        Orange orange1 = new Orange(1.5F);
        Orange orange2 = new Orange( 1.5F);
        Orange orange3 = new Orange( 1.5F);
        Orange orange4 = new Orange(1.5F);

        orangeArrayList.add(orange0);
        orangeArrayList.add(orange1);
        orangeArrayList.add(orange2);
        orangeArrayList.add(orange3);
        orangeArrayList.add(orange4);




        Box<Orange> box3 = new Box<>(orangeArrayList);
//        System.out.println(box3.compareList(box1));
// Сравнение ящиков апл и оранж не проходит. Просит привести к одному типу
        System.out.println(box3.getWeightList());








    }
}

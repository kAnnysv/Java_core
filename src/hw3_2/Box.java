package hw3_2;

import java.util.ArrayList;

public class Box < T extends Fruit> {

    ArrayList<T> fruitList;

    public Box(ArrayList<T> fruitList){
        this.fruitList = fruitList;
    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }

    public Float getWeightList(){
        Float result = Float.valueOf(0);
        for(T t: getFruitList()) {
            if(t != null) {
                Float value = t.getWeight();
                result = result + value;
            }
        }
        return result;
    }

    public Boolean compareList(Box<T> box){
        if(this.getWeightList().floatValue() == box.getWeightList().floatValue()) return true;
         return false;

    }

    public void toEmptyList(Box<T> box){
        System.out.println("Текущая коробка до : " + this.getWeightList());
        System.out.println("Другая коробка до : " + box.getWeightList() );
        for (T t: getFruitList()
             ) { this.getFruitList().add(t);

        }
        box.getFruitList().clear();
        System.out.println("Текущая коробка после: " + this.getWeightList());
        System.out.println("Другая коробка после: " + box.getWeightList());

    }




}

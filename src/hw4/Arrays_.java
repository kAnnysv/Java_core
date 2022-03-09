package hw4;

import java.util.*;

public class Arrays_ {
    public static void main(String[] args) {

        String [] arr = new String[]{"1", "2", "3", "3", "5", "6", " 7", "1", "2", "3", "4", "5", "6", " 7", "8"};

        List<String> arrList = new ArrayList<String>(Arrays.asList(arr));
        Set<String> hashSetList = new HashSet<String>(arrList);
        HashMap<String,Integer>arrMap = new HashMap<String, Integer>();



        System.out.println(hashSetList);

        for (int i = 0; i < arr.length; i++) {
            if(arrMap.containsKey(arr[i])) {
                int counter = arrMap.get(arr[i]);
                arrMap.put(arr[i], counter + 1);
            }
            else{
                arrMap.put(arr[i], 1);
            }

        }
        System.out.println(arrMap);



        checkArray(arr); // Можно ещё так заменить не уникальные значения в массиве




    }
    public static void checkArray(String[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = i +1; j < arrays.length; j++) {
                if(arrays[i] == arrays[j]) {
                    arrays[i] = "-";
                }

            }


        }
        System.out.println(Arrays.toString(arrays));


    }





}

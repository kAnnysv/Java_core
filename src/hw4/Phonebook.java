package hw4;

import java.util.HashMap;

public class Phonebook {

    private HashMap<String,String>phoneBook = new HashMap<String,String>();



    public void addPB(String phone, String name) {
        phoneBook.put(phone,name);
    }


    public String getPhone(String name) {
        String result = phoneBook.get(name);//
        if (result == null) {
            return "абонент не найден";
        }
        return result;
    }

    public String getPhone1(String name) {
        if(phoneBook.containsValue(name)) {
            String result = "Phone  " + name + "-";
            for (String key: phoneBook.keySet()
                 ) { if(phoneBook.get(key).equals(name))
                     result += key + ";";

            }
            return result;

        }else return "абонент не найден";


    }



}

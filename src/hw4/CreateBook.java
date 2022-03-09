package hw4;

import java.util.Arrays;

public class CreateBook {

    public static void main(String[] args) {

        Phonebook phonebook =new Phonebook();
        phonebook.addPB("234","ety");
        phonebook.addPB("777","ety");
        phonebook.addPB("884","rrr");
        phonebook.addPB("880","OOO");
        phonebook.addPB("000","ety");


        System.out.println(phonebook.getPhone("rrr")); // мой метод не работает

        System.out.println(phonebook.getPhone1("ety"));










    }
}

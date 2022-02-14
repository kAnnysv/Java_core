package hw1;

public class Person {
    private String name;
    private String surname;
    private int age;
    private int maxDistance; // Сколько метров дистанции спасобен преодолеть участник

    public Person(String name, String surname, int age, int maxDistance) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.maxDistance = maxDistance;
    }

    String getInfo() {
        return this.name + " " +
                this.surname + " " +
                this.age + " y.o.";
    }

    boolean run(float distance){
        return (distance <= maxDistance);
    }






}

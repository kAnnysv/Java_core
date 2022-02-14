package hw1;

public class DreamTeam {

    public static void main(String[] args){



        Person[] team = {
                new Person("Anna", "Sin", 34, 3000),
                new Person("Kanye","Sin",51,3500),
                new Person("Ezhi","Sestrin",29,1000),
                new Person("Tina","Ezhikova",29,5000)
        };
        System.out.println("==================");
        getInfoTeam(team);
        System.out.println("==================");
        course(team);
        System.out.println("==================");




    }

    public static void getInfoTeam(Person[] team){
        System.out.println("Team composition");
        for (int i = 0; i < team.length; i++) {
            System.out.println((i + 1) + " " + team[i].getInfo());

        }
    }

    public static void course (Person[] team){
        System.out.println("Course 3000m");
        for (int i = 0; i < team.length; i++) {
            if (team[i].run(3000) == true){
                System.out.println((i + 1) + " " + team[i].getInfo() + "  Could");

            } else{ System.out.println((i + 1) + " " + team[i].getInfo() + "  Could not");}



        }
    }

}

package HW9;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Course course1 = new Course("1111");
        Course course2 = new Course("22222");
        Course course3 = new Course("33333");
        Course course4 = new Course("44444");
        Course course5 = new Course("55555");
        Course course6 = new Course("66666");

        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("st1", List.of(course1, course2)),
                new Student("st2", List.of(course1, course2, course4)),
                new Student("st3", List.of(course3, course2, course5, course4, course5)),
                new Student("st4", List.of(course1)),
                new Student("st5", List.of(course1, course2, course4, course3))


        ));

// 1.
        students.stream().flatMap(student -> student.getCourseList().stream()).collect(Collectors.toSet())
                .forEach(course -> {
                    System.out.println("Курс " + course.getName());
                });
// 2.
        students.stream().sorted((o1, o2) -> o2.getCourseList().size() - o1.getCourseList().size()).limit(3).collect(Collectors.toList())
                .forEach(h -> {
                    System.out.println(h.getName());
                });
// 3.
        students.stream().filter(student -> student.courseList.contains(course1)).collect(Collectors.toList())
                .forEach(h -> {
                    System.out.println(h.getName());
                });



        System.out.println("------------------------------------------");


// Дополнительное задание

        Long count = students.stream().filter(student -> {
            return student.courseList.size() < 3;
        }).count();
        System.out.println( "У " + count + " студентов меньше 3x курсов.");

        students.stream().filter(student -> student.courseList.size() < 3).forEach(student -> {
            System.out.println(student.getName());
        });

        String x = "st1";
        students.stream().filter(student -> {
            return student.getName() == x;
        }).flatMap(student -> student.courseList.stream()).forEach(course -> {
            System.out.println("Студент " + x  + " изучает курс " + course.getName());
        });

        students.stream().map(student -> student.getName().toUpperCase()).forEach(System.out::println);





    }









}

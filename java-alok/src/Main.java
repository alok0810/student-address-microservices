import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Apple", 1, "F"));
        students.add(new Student("Amar", 2, "M"));
        students.add(new Student("Aaan", 3, "M"));
        students.add(new Student("Alok", 4, "M"));
        System.out.println("****Sorting the objects in list by name****");
        //students.stream().sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);


        Optional<String> gen = students.stream().filter(s->s.getRollno()>1).map(Student::getName).findFirst();
        students.stream().filter(s->s.getRollno()>1).map(Student::getName).anyMatch(s->s.startsWith("K"));
        System.out.println("****Filtering the objects in list by rollno****");
        System.out.println(students.stream().filter(s->s.getRollno()>1).map(Student::getName).anyMatch(s->s.startsWith("A")));
        System.out.println("Gender----->"+""+gen.get());
        students.stream().filter(student->student.getRollno()<4).collect(groupingBy(student -> student.gender));
        //System.out.println(sortedStudents);
        System.out.println( students.stream().filter(student->student.getRollno()<4).collect(groupingBy(student -> student.gender)));
    }
}
package task3;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

    public static void main(final String... args) {

    final Map<Subject,Grade> gradeMap = new HashMap<>();

    final Student student1 = new Student("Natalia", "Duzhak", 2, "IT",gradeMap,314235);

    System.out.println(student1);

    gradeMap.put(new Subject("Programing"),new Grade(5));
    gradeMap.put(new Subject("English"),new Grade(3));
    gradeMap.put(new Subject("Math"),new Grade(5));
    System.out.println(gradeMap);

    }
}

package task4;

import task3.Subject;
import task3.Student;
import task3.Grade;

import java.util.*;
import java.util.ArrayList;

public class Task4 {
    public static void main(final String... args) {

        final List<Student> students = new ArrayList<>();

        final Map<Subject, Grade> gradeMap1 = new HashMap<>();
        final Map<Subject, Grade> gradeMap2 = new HashMap<>();
        final Map<Subject, Grade> gradeMap3 = new HashMap<>();
        final Map<Subject, Grade> gradeMap4 = new HashMap<>();

        final Student student1 = new Student("Natalia", "Duzhak", 2, "IT", gradeMap1, 214);


        gradeMap1.put(new Subject("Physics"), new Grade(5));
        gradeMap1.put(new Subject("English"), new Grade(4));
        gradeMap1.put(new Subject("Math"), new Grade(5));


        final Student student2 = new Student("Misha", "Duzhak", 2, "IT", gradeMap2, 432);


        gradeMap2.put(new Subject("Physics"), new Grade(3));
        gradeMap2.put(new Subject("English"), new Grade(3));
        gradeMap2.put(new Subject("Math"), new Grade(3));
        //System.out.println(gradeMap2);


        final Student student3 = new Student("Andriy", "Duzhak", 2, "IT", gradeMap3, 2156);


        gradeMap3.put(new Subject("Physics"), new Grade(5));
        gradeMap3.put(new Subject("English"), new Grade(5));
        gradeMap3.put(new Subject("Math"), new Grade(5));


        final Student student4 = new Student("Maria", "Duzhak", 2, "IT", gradeMap4, 4633);


        gradeMap4.put(new Subject("Physics"), new Grade(4));
        gradeMap4.put(new Subject("English"), new Grade(3));
        gradeMap4.put(new Subject("Math"), new Grade(4));


        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);


        addSubject(students, new Subject("Programming"));
        printStudents(students);
        System.out.println(averageMark(student1));
        System.out.println(averageMark(student2));
        System.out.println(averageMark(student3));
        System.out.println(averageMark(student4));
        System.out.println((student3));
        mapStudents(students, new Subject("Math"));
    }

    public static void addSubject(final List<Student> students, final Subject subject) {
        for (final Student student : students) {
            student.getGradeMap().put(subject, new Grade(0));
        }
    }

    private static void printStudents(final List<Student> students) {
        students.forEach(System.out::println);
    }

    private static double averageMark(final Student students) {

        return students.getGradeMap().values().stream().mapToInt(e -> e.getGrade()).average().orElse(0);

    }

    private static void mapStudents(final List<Student> students, final Subject subject) {

        final Map<Long, Integer> map = new HashMap<>();

        for (final Student student : students) {

            map.put(student.getId(), student.getGradeMap().get(subject).getGrade());

        }
        System.out.println(map);
    }

}
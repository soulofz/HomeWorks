package HW15.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Жан", "C36", 1, Arrays.asList(1, 1, 1)));
        students.add(new Student("Миша", "C36", 2, Arrays.asList(2, 2, 2)));
        students.add(new Student("Леша", "C36", 1, Arrays.asList(3, 3, 3)));
        students.add(new Student("Ваня", "C36", 3, Arrays.asList(5, 5, 4)));

        System.out.println(students);
        StudentManager.afterExams(students);
        System.out.println(students);
        StudentManager.courseInfo(students, 2);
    }
}
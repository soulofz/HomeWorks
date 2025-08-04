package HW15.Task3;

import java.util.List;

public class StudentManager {
    public static void afterExams(List<Student> students) {
        for (int i = students.size() - 1; i >= 0; i--) {
            Student student = students.get(i);
            if (student.averageMark() >= 3) {
                student.nextCourse();
            } else {
                students.remove(student);
            }
        }
    }

    public static void courseInfo(List<Student> students, int course) {
        System.out.println("Студенты " + course + "курса.");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}

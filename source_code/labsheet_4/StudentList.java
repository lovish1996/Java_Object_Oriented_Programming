package source_code.labsheet_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class StudentList {
    public static Student[] students = new Student[10];
    public static int count = 0;

    public static void addStudent(Student student) {
        if (count >= 10)
            return;
        students[count++] = student;
    }

    public static void printStudents() {
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }

    public static Student[] getStudentsWithAge(int age) {
        List<Student> studentList = new ArrayList<>();

        for (Student student : students) {
            if (student != null && student.getAge() == age) {
                studentList.add(student);
            }
        }

        studentList.sort(Comparator.comparing(o -> o.getName().getFirstName()));

        Student[] studentsWithAge = new Student[studentList.size()];
        return (studentList.size() == 0) ? null : studentList.toArray(studentsWithAge);
    }

    public static Student[] getStudentsWithLastName(String lastName) {
        List<Student> studentList = new ArrayList<>();

        for (Student student : students) {
            if (student != null && Objects.equals(student.getName().getLastName(), lastName)) {
                studentList.add(student);
            }
        }

        Student[] studentsWithLastName = new Student[studentList.size()];
        return (studentList.size() == 0) ? null : studentList.toArray(studentsWithLastName);
    }

    public static Student[] getStudentsInRange(int minAge, int maxAge) {
        List<Student> studentList = new ArrayList<>();

        for (Student student : students) {
            if (student != null && student.getAge() >= minAge && student.getAge() <= maxAge) {
                studentList.add(student);
            }
        }

        studentList.sort(Comparator.comparingInt(Student::getAge));

        Student[] studentsWithAgeInRange = new Student[studentList.size()];
        return (studentList.size() == 0) ? null : studentList.toArray(studentsWithAgeInRange);
    }

}

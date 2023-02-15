package source_code.labsheet_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class TestStudentList {

    private static Scanner scanner;

    public static Student readSingleStudent(Scanner scanner) {
        String name = scanner.next();
        String gender = scanner.next();
        int age = scanner.nextInt();

        Student student = new Student(name, gender, age);
        return student;
    }

    public static ArrayList<Student> readStudents() throws FileNotFoundException {


        File file = new File("/Users/lovisharora/Documents/Java_Object_Oriented_Programming/source_code/labsheet_7/students_records.txt");
        scanner = new Scanner(file);

        ArrayList studentList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            studentList.add(readSingleStudent(scanner));
        }

        return studentList;
    }

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Student> studentList = readStudents();

        System.out.println("Student's list: " + studentList);

        ListIterator studentListIterator = studentList.listIterator();

        System.out.println();
        while (studentListIterator.hasNext()) {
            Object element = studentListIterator.next();
            System.out.println(element);
        }

        studentListIterator = studentList.listIterator();
        while (studentListIterator.hasNext()) {
            Student student = (Student) studentListIterator.next();
            if (student.getGender().equals("Male")) {
                student.setName("Mr. " + student.getName());
            } else {
                student.setName("Miss. " + student.getName());
            }
        }

        Iterator studentIterator = studentList.iterator();

        System.out.println();
        System.out.println("Modified contents of the studentList:");
        while (studentIterator.hasNext()) {
            Object element = studentIterator.next();
            System.out.println(element);
        }

        // Traversing list in reverse order
        System.out.println();
        System.out.println("Traversing contents of the studentList in reverse:");
        while (studentListIterator.hasPrevious()) {
            Object element = studentListIterator.previous();
            System.out.println(element);
        }
    }
}

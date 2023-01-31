package source_code.labsheet_4;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class StudentTest {
    public static Student readStudent(Scanner scanner) throws IOException {
//        System.out.println("Enter student details: ");
//        System.out.println("Enter your first name: ");
        String firstName = scanner.next();
        scanner.nextLine();

//        System.out.println("Enter your middle name: ");
        String middleName = scanner.next();
        scanner.nextLine();

//        System.out.println("Enter your last name: ");
        String lastName = scanner.next();
        scanner.nextLine();

//        System.out.println("Enter the name format, 1 for ',' and 2 for ';': ");
        int nameFormat = scanner.nextInt();
        scanner.nextLine();

//        System.out.println("Enter the age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        Name name;
        if (nameFormat == 1) {
            name = new Name(firstName + "," + middleName + "," + lastName);
        } else if (nameFormat == 2) {
            name = new Name(lastName + ";" + middleName + ";" + firstName);
        } else {
            return null;
        }

        return new Student(name, age);
    }

    public static void main(String[] args) throws IOException {

        File file = new File("/Users/lovisharora/Documents/Java_Object_Oriented_Programming/source_code/labsheet_4/student_records.txt");

        Scanner scanner = new Scanner(file);

        for (int i = 0; i < 5; i++) {
            StudentList.addStudent(readStudent(scanner));
        }

//        StudentList.printStudents();


        System.out.println("Students with age = 16:");
        for (Student student : Objects.requireNonNull(StudentList.getStudentsWithAge(16))) {
            System.out.println(student);
        }
        System.out.println();

        System.out.println("Students with last name as DLastName:");
        for (Student student : Objects.requireNonNull(StudentList.getStudentsWithLastName("DLastName"))) {
            System.out.println(student);
        }
        System.out.println();

        System.out.println("Students with age b/w 16 and 20:");
        for (Student student : Objects.requireNonNull(StudentList.getStudentsInRange(16, 20))) {
            System.out.println(student);
        }
    }
}

package source_code.labsheet_4;

public class Student {
    private Name name;
    private int age;

    public Student(Name name, int age) {
        this.name = name;
        this.age = age;
    }

    public Name getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name.toString() +
                ", age=" + age +
                '}';
    }
}

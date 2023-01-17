import java.util.jar.Attributes.Name;

public class TestStudents {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 3;
        Student[] students = new Student[NUM_STUDENTS];
        students[0] = new DmeEnStudent("Manee");
        students[1] = new ComEnStudent("Mana");
        students[2] = new ComEnStudent("Piti");
        for (int i = 0; i < NUM_STUDENTS; i++) {
            students[i].writePrograms();
        }
    }
}

abstract class Student {
    String name;

    abstract void writePrograms();

    Student(String name) {
        this.name = name;
    }
}

class ComEnStudent extends Student {
    ComEnStudent(String name) {
        super(name);
    }

    public void writePrograms() {
        System.out.println(name + " writes programs in Python and Java");
    }
}

class DmeEnStudent extends Student {
    DmeEnStudent(String name) {
        super(name);
    }

    public void writePrograms() {
        System.out.println(name + " writes programs in Python and C#");
    }
}
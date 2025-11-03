package chap04_class;

class Student {
    private String name;
    private int birth;

    Student(String name, int birth) {
        this.name = name;
        this.birth = birth;
    }

    boolean isOrder(Student other) {
        if (other.birth > this.birth) {
            return true;
        }
        return false;
    }

    String getName() {
        return name;
    }
}

public class P2 {
    public static void main(String[] args) {
        Student s1 = new Student("pby", 19900212);
        Student s2 = new Student("dlwlrma", 19930516);
        Student s3 = new Student("JianLee", 19981104);
        printInfor(s1, s2);
        printInfor(s3, s2);
    }

    private static void printInfor(Student s1, Student s2) {
        if (s1.isOrder(s2)) {
            System.out.println(s1.getName() + " > " + s2.getName());
        } else {
            System.out.println(s1.getName() + " <= " + s2.getName());
        }
    }
}

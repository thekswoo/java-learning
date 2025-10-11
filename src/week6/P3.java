package week6;

import java.util.Objects;

class Student {
    private int ID;
    private String name;

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        if(this.ID == s.ID && this.name.equals(s.name)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID,name);
    }
}

public class P3 {
    public static void main(String[] args) {
        Student s1 = new Student(16,"dlwlrma");
        Student s2 = new Student(16,"dlwlrma");

        if(s1.hashCode() == s2.hashCode()){
            if(s1.equals(s2)){
                System.out.println("s1 == s2");
                return;
            }
        }
        System.out.println("s1 != s2");
    }
}

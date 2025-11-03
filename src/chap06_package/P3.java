package chap06_package;

import java.util.Objects;

class Student {
    private int ID;
    private String name;

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) { //인자로 전덜되는 객체가 다른 것이 오면 오류 발생 가능
        Student s = (Student) obj; //다운캐스팅
        //instance 검사 조건 추가 -> 타입체크
        if (this.ID == s.ID && this.name.equals(s.name)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name); //잘 만들어진 메소드 사용 굿
    }
}

public class P3 {
    public static void main(String[] args) {
        Student s1 = new Student(16, "dlwlrma");
        Student s2 = new Student(16, "dlwlrma");

        if (s1.hashCode() == s2.hashCode()) {
            if (s1.equals(s2)) {
                System.out.println("s1 == s2");
                return;
            }
            System.out.println("s1 != s2"); //이거를 추가 안 했다...
        }
        System.out.println("s1 != s2");
    }
}

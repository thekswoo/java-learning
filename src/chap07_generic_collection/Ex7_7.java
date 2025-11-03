//HashMap에 객체 저장, 학생 정보 관리
/*
    id와 전화번호로 구성되는 Student 클래스를 만들고,
    이름을 '키'로 하고 Student 객체를 '값'으로 하는 해시맵을 만들어라.
 */

package chap07_generic_collection;

import java.util.*;

class Student_7 {
    private int id;
    private String tel;

    public Student_7(int id, String tel) {
        this.id = id;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public String getTel() {
        return tel;
    }
}

public class Ex7_7 {
    public static void main(String[] arges) {
        HashMap<String, Student_7> map = new HashMap<String, Student_7>();

        map.put("황기태", new Student_7(1, "010-111-1111"));
        map.put("이재문", new Student_7(2, "010-222-2222"));
        map.put("김남윤", new Student_7(3, "010-333-3333"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("검색할 이름?");
            String name = scanner.next();

            if (name.equals("exit")) {
                break;
            }

            Student_7 student = map.get(name);

            if (student == null) {
                System.out.println(student + "는 없는 사람입니다.");
            } else {
                System.out.println("id:" + student.getId() + ", 전화:" + student.getTel());
            }

        }
    }
}

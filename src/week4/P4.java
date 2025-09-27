import java.util.Scanner;

public class Student2 {

    private String name;
    private int age;

    // 생성자에서 major 매개변수 제거
    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // printInfor 메서드
    public void printInfor() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class P3 {
    static Scanner scan = new Scanner(System.in);

    // Scanner 자원 해제 메서드
    static void closeScanner() {
        scan.close();
    }

    public static void main(String[] args) {
        int number;
        System.out.println("Enter #students: ");
        number = scan.nextInt();
        scan.nextLine();  // 개행 문자 처리

        Student2[] sArr = makeArray(number);
        System.out.println();
        printArray(sArr);
        P3.closeScanner();
    }

    // 학생 객체 배열을 생성하는 메서드
    static Student2[] makeArray(int number) {
        Student2[] sArr = new Student2[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter your name and birth: ");
            String name = scan.nextLine();  // 이름 입력 받기
            int age = scan.nextInt();       // 나이 입력 받기
            scan.nextLine(); // 버퍼에서 개행 문자 처리

            sArr[i] = new Student2(name, age);
        }

        return sArr;
    }

    // 학생 배열을 출력하는 메서드
    static void printArray(Student2[] sArr) {
        for (Student2 student : sArr) {
            student.printInfor();  // printInfor() 메서드를 사용
        }
    }
}

package week4;

import java.util.Scanner;

class Student2 {
    private String name;
    private int birth;

    Student2(String name, int birth) {
        this.name = name;
        this.birth = birth;
    }

    String getName() {
        return name;
    }

    int getBirth() {
        return birth;
    }
}

public class P3 {
    static Scanner scan = new Scanner(System.in);

    static void closeScanner() {
        scan.close();
    }

    //no touch main method
    public static void main(String[] args) {
        int number;
        System.out.print("Enter #student: ");
        number = scan.nextInt();
        Student2[] sArr = makeArray(number);
        System.out.println();
        printArray(sArr);
        P3.closeScanner();
    }

    static Student2[] makeArray(int number) {
        Student2[] students = new Student2[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter your name and birth: ");
            String name = scan.next();
            int birth = scan.nextInt();
            students[i] = new Student2(name, birth);
        }
        return students;
    }

    private static void printArray(Student2[] sArr) {
        for (Student2 student : sArr) {
            System.out.println(student.getName() + " " + student.getBirth());
        }
    }


}

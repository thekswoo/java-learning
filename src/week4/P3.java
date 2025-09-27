//package week4;

import java.util.Scanner;

class Student2 {
    private String name;
    private int age;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfor() {
        System.out.println(name + " " + age);
    }
}

public class P3 {
    static Scanner scan = new Scanner(System.in);

    static void closeScanner() {

        scan.close();
    }

    static void main(String[] args) {
        int number;
        System.out.print("Enter #students: ");
        number = scan.nextInt();
        scan.nextLine();
        Student2[] sArr = makeArray(number);
        System.out.println();
        printArray(sArr);
        P3.closeScanner();
    }

    static Student2[] makeArray(int number) {
        Student2[] sArr = new Student2[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter your name and birth: ");
            String name = scan.next();
            int age = scan.nextInt();
            scan.nextLine();

            sArr[i] = new Student2(name, age);
        }

        return sArr;
    }

    static void printArray(Student2[] sArr) {
        for (Student2 student : sArr) { //using for-each
            student.printInfor(); //using printfor method in Student2 class
        }
    }
}

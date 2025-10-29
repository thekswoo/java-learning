package week2;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String name;

        System.out.print("age: ");
        age = scanner.nextInt();
        System.out.print("name: ");
        scanner.nextLine();
        name = scanner.nextLine();

        System.out.println(age + " " + name);
    }
}

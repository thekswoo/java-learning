package week2;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Coordinates of a point (x, y): ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.print("(" + x + ", " + y + "): ");

        if (x < 100 || x > 200 || y < 100 || y > 200) {
            System.out.print("not in the rectangle");
        } else {
            System.out.print("inside the rectangle");
        }
    }
}

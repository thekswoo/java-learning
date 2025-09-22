package week3;//package practice_3week;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        int[][] arr = makeArray();
        System.out.println();
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static int[][] makeArray() { //main이 static -> method func static
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[1];
        arr[2] = new int[4];
        System.out.println("Enter 8 integers");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }
}

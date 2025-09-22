package week3;//package practice_3week;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        System.out.print("Input 5 positive numbers: ");
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int max = -1;
        arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print("Maximun number: " + max);
        scanner.close();
    }
}

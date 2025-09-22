package week3;//package practice_3week;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        System.out.print("Input 5 positive numbers: ");
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int sum = 0;
        arr = new int[5];
        for (int i = 0; i < arr.length; i++) { //No use magic number
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.print("Average: " + avg);
    }
}

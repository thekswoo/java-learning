package week3;//package practice_3week;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 6 integers one by one.");

        int n=0;

        int [][]arr = new int[2][3];

        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                while(true){
                    try{
                        System.out.print("> ");
                        arr[i][j] = scanner.nextInt(); //string buffer를 비우기 위함 ? 안 비우면 무한루프
                        break;
                    }catch (InputMismatchException e){
                        System.out.println("Not an integer!");
                        scanner.nextLine(); //delete token
                    }
                }
            }
        }
        for(int []i : arr){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

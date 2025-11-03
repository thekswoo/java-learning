package chap03_loop_array_exception;

import java.util.Scanner;

public class Ex3_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("나뉨수를 입력하시오:");
            int dividend = scanner.nextInt();
            System.out.print("나눗수를 입력하시오:");
            int divisor = scanner.nextInt();
            try {
                System.out.print(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend / divisor + "입니다."); //divisor 0입력시 예외 발생
                break;
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요");
            }
        }
        scanner.close();
    }
}

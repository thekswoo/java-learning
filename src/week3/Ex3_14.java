package week3;

import java.util.Scanner;

public class Ex3_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dividend;
        int divisor;

        System.out.print("나뉨수를 입력하시오:");
        dividend = scanner.nextInt();
        System.out.print("나눗수를 입력하시오:");
        divisor = scanner.nextInt();
        System.out.print(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend / divisor + "입니다."); //divisor 0입력시 예외 발생
        scanner.close();
    }
}

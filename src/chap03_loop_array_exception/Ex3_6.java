package chap03_loop_array_exception;

import java.util.Scanner;

public class Ex3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("exit을 입력되면 종료합니다.");
        while(true) {
            System.out.print(">>");
            String text = scanner.nextLine();
            if(text.equals("exit")) { //문자열 비교시 equals() 사용
                break;
            }
        }
        System.out.println("종료합니다...");
        scanner.close();
    }
}

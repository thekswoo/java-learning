//Math 클래스 메소드 활용
/*
    Math 클래스의 다양한 메소드 활용 예를 보여라.
 */

package chap06_package;

public class Ex6_10 {
    public static void main(String[] args) {
        double a = Math.PI;
        System.out.println(Math.PI); //원주율 상수 출력
        System.out.println(Math.ceil(a)); //올림
        System.out.println(Math.floor(a)); //내림
        System.out.println(Math.sqrt(9)); //제곱근
        System.out.println(Math.exp(2)); //e의 2제곱
        System.out.println(Math.round(a)); //반올림

        System.out.print("이번주 행운의 번호는 ");
        for (int i = 0; i < 5; i++) {
            System.out.print((int) (Math.random() * 45 + 1) + " ");
        }
    }
}

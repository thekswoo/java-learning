//박싱과 언박싱
/*
    다음 코드에 대한 결과는 무엇인가?
 */
package week6;

public class Ex6_6 {
    public static void main(String[] args) {
        int n = 10;
        Integer intObject = n; //auto boxing
        System.out.println("intObject = " + intObject);

        int m = intObject + 10; //auto unboxing
        System.out.println("m = " + m);
    }
}

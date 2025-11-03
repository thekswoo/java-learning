//static 멤버를 가진 Calc 클래스 작성
//전역 함수로 작성하고자하는 abs, max, min의 3개 함수를 static메소드로 작성하고 호출하는 사례를 보여라.

package chap04_class;

class Calc {
    static int abs(int a) { //abs는 절댓값을 의미
        return a > 0 ? a : -a; //a가 양수라면 a 그대로 리턴 음수또는 0이라면 -a리턴
    }

    static int max(int a, int b) {
        return a > b ? a : b; //a가 크면 a리턴 또는 a와 b가 같거나 b가 더 크면 b리턴
    }

    static int min(int a, int b) {
        return a < b ? a : b; //작은거 리턴
    }
}

public class Ex4_11 {
    public static void main(String[] args) {
        System.out.println(Calc.abs(-5));
        System.out.println(Calc.max(10, 8));
        System.out.println(Calc.max(-3, -8));
    }
}

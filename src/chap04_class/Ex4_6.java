//Circle 객체 배열 만들기
//반지름이 0-4인 Circle 객체 5개를 가지는 배열을 생성하고, 배열에 있는 모든 Circle객체의 면적을 출력하라

package chap04_class;

class Circle {
    int radis;

    public Circle(int radis) {
        this.radis = radis;
    }

    public double getArea() {
        return 3.14 * radis * radis;
    }
}

public class Ex4_6 { //CircleArray
    public static void main(String[] args) {
        Circle[] c;
        c = new Circle[5];

        for (int i = 0; i < 5; i++) { //각각 배열 모두 초기화
            c[i] = new Circle(i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.print((int) (c[i].getArea()) + " "); //casting
        }
    }
}
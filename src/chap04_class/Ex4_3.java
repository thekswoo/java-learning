//두 개의 생성자를 가진 Cicle class
//다음 코드는 2개의 생성자를 가진 Circle class이다. 실행결과는 무엇인가?
package chap04_class;

public class Ex4_3 {
    int radius;
    String name;

    public Ex4_3() {
        radius = 1; //radius의 초기값
        name = "";
    }

    public Ex4_3(int r, String n) {
        radius = r;
        name = n;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Ex4_3 pizza = new Ex4_3(10, "자바피자"); //객체 생성, 반지름 10

        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Ex4_3 donut = new Ex4_3();
        donut.name = "도넛피자";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}

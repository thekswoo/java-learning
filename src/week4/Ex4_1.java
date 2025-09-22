//Circle class의 객체 생성 및 활용
//반지름과 이름을 가진 Circle class를 작성하고, Circle 클래스의 객체를 생성하라. 그리고 객체가 생성된 모습을 그려보라.

package week4;

public class Ex4_1 {
    int radius;
    String name;

    public Ex4_1() { //Circle
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Ex4_1 pizza;
        pizza = new Ex4_1();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Ex4_1 donut = new Ex4_1();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}

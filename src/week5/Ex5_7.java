//추상 클래스의 구현 연습
/*
    다음 추상 클래스 Calculator를 상속 받은 GoodCalc 클래스를 구현하라
 */

package week5;

abstract class Calculator {
    public abstract int add(int a, int b);

    public abstract int subtract(int a, int b);

    public abstract double average(int[] a);
}

class GoodCalc extends Calculator {
    @Override
    public int add(int a, int b) { //추상메소드 구현
        return a + b;
    }

    @Override
    public int subtract(int a, int b) { //추상메소드 구현
        return a - b;
    }

    @Override
    public double average(int[] a) { //추상메소드 구현
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return (double) sum / a.length;
    }
}

public class Ex5_7 {
    public static void main(String[] args) {
        GoodCalc c = new GoodCalc();
        System.out.println(c.add(2, 3));
        System.out.println(c.subtract(2, 3));
        System.out.println(c.average(new int[]{2, 3, 4}));
    }
}

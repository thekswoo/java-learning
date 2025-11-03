//Object 클래스로 객체 속성 알아내기
/*
    객체 레퍼런스만으로 객체의 클래스명, 해시코드 값, 객체의 문자열을 출력해보자
 */
package chap06_package;

class Point_1 {
    private int x, y;
    public Point_1(int x,int y){
        this.x = x;
        this.y = y;
    }
}

public class Ex6_1 {
    public static void print(Object obj){
        System.out.println(obj.getClass().getName());
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Point_1 p = new Point_1(2,3);
        print(p);
    }
}

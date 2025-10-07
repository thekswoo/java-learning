//Point 클래스에 toString() 작성
/*
    Point 클래스에 Point 객체를 문자열로 리턴하는 toString() 메소드를 작성하라
 */
package week6;

class Point_2 {
    private int x;
    private int y;

    public Point_2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

public class Ex6_2 {
    public static void main(String[] args) {
        Point_2 p = new Point_2(2, 3);
        System.out.println(p.toString()); //point 객체를 문자열로 리턴 출력
        System.out.println(p); //p는 p.toString()으로 자동 변환
        System.out.println(p + "입니다."); //p.toString() + "입니다." 으로 자동 변환
    }
}

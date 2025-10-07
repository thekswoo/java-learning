//Point 클래스에 equals() 작성
/*
    Point 클래스에 두 점의 좌표가 같으면 true를 리턴하는 equals()를 작성하라
 */

package week6;

class Point_3 {
    private int x, y;

    public Point_3(
            int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Point_3 p) {
        if (this.x == p.x && this.y == p.y) {
            return true;
        }
        return false;
    }
}

public class Ex6_3 {
    public static void main(String[] args) {
        Point_3 a = new Point_3(2, 3);
        Point_3 b = new Point_3(2, 3);
        Point_3 c = new Point_3(3, 4);

        if (a == b){ //false -> 다른 주소를 가리킴
            System.out.println("a == b");
        }
        if(a.equals(b)){ //true -> 같은 필드 값
            System.out.println("a is equal to b");
        }
        if(a.equals(c)){//false -> 다른 필드 값
            System.out.println("a is equal to c");
        }
    }
}

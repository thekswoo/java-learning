//super()를 활용한 ColorPoint 작성
/*
    super()를 이용하여 ColorPoint 클래스의 생성자에서 슈퍼 클래스 Point의 생성자를 호출하는 예를 보인다.
 */

package chap05_inheritance;

class Point_ { //Ex5_1 Point class와 이름이 겹쳐 "Point_"로 수정
    private int x, y;

    public Point_(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}

class ColorPoint_ extends Point_ {
    private String color; //점의 색
    public ColorPoint_(int x, int y,String color) {
        super(x, y); //Point 부모 클래스 생성자 호출
        this.color = color;
    }
    public void showColorPoint() {
        System.out.print(color);
        showPoint();//Point 클래스의 showPoint() 호출
    }
}

public class Ex5_3 {
    public static void main(String[] args) {
        ColorPoint_ cp = new ColorPoint_(5,6,"blue");
        cp.showColorPoint();
    }
}

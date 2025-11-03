//Rect 클래스와 equals() 만들기 연습
/*
    int타입의 width와 height 필드를 가지는 Rect 클래스를 작성하고,
    면적이 같으면 두 Rect객체가 같은 것으로 판별하는 equals()를 작성하라.
    생성자에서 너비와 높이를 받아 width, height 필드를 초기화하라.
 */

package chap06_package;

class Rect{
    private int width,height;

    Rect(int width, int height){
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object obj){
        Rect p = (Rect) obj;
        if(width * height == p.width * p.height){
            return true;
        }else{
            return false;
        }
    }
}

public class Ex6_4 {
    public static void main(String[] args) {
        Rect a = new Rect(2, 3);
        Rect b = new Rect(3, 2);
        Rect c = new Rect(3, 4);

        if(a.equals(b)){ //true -> 동일한 넓이 6 == 6
            System.out.println("a is equal to b");
        }
        if(a.equals(c)){ //false -> 다른 넓이 6 != 12
            System.out.println("a is equal to c");
        }
        if(b.equals(c)){ //false -> 다른 넓이 6 != 12
            System.out.println("b is equal to c");
        }
    }
}

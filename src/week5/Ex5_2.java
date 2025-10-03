//상속 관계에 있는 클래스 간 멤버 접근

/*
클래스 Person을 아래와 같은 멤버 필드를 갖도록 선언하고 클래스 Student는 클래스 Person
을 상속받아 각 멤버 필드에 값을 저장하시오.
이 예제에서 Person 클래스의 private 필드인 weight는 Student 클래스에서는 접근이 불가능하여
슈퍼 클래스인 Person의 getXXX, setXXX 메소드를 통해서만 조작이 가능하다.

• private int weight;
• int age;
• protected int height;
• public String name;
 */

package week5;

class Person {
    private int weight;
    int age;
    protected int height;
    public String name;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}

class Student__ extends Person {
    public void set() {
        //weight = 99; //private 접근 불가
        age = 30; //default 접근 가능
        height = 175; //protected 같은 패키지 접근 가능
        name = "홍길동"; //public 접근 가능
    }
}

public class Ex5_2 {
    public static void main(String[] args) {
        Student__ s = new Student__();
    }
}
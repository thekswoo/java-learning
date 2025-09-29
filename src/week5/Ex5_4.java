//instanceof 연산자 활용
/*
    instanceof 연산자를 이용하여 상속 관계에 따라 레퍼런스가 가리키는 객체의 타입을 알아본다.
    실행 결과는 무엇인가?
 */

package week5;

class Person_{}
class Student_ extends Person_{}
class Researcher_ extends Person_{}
class Professor_ extends Researcher_{}

public class Ex5_4 {
    static void print (Person_ p) {
        if(p instanceof Person_) {
            System.out.print("Person ");
        }
        if(p instanceof Student_) {
            System.out.print("Student ");
        }
        if(p instanceof Researcher_){
            System.out.print("Researcher ");
        }
        if(p instanceof Professor_){
            System.out.print("Professor ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.print("new Student() -> \t"); print (new Student_());
        System.out.print("new Researcher() -> \t"); print (new Researcher_());
        System.out.print("new Professor() -> \t"); print (new Professor_());
    }
}

//인터페이스 구현
/*
    PhoneInterface 인터페이스를 구현하고
    flash() 메소드를 추가한 SamsungPhone 클래스를 작성하라.
 */

package chap05_inheritance;

interface PhoneInterface {
    final int TIMEOUT = 10000; //상수 field

    void sendCall(); //abstract method

    void receiveCall(); //abstract method

    default void printLogo() { //default method
        System.out.println("** Phone **");
    }
}

class SamsungPhone implements PhoneInterface {
    @Override
    public void sendCall() {
        System.out.println("띠리리리링");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화가 왔습니다.");
    }

    //add new method
    public void flash() {
        System.out.println("전화기에 불이 켜졌습니다.");
    }
}

public class Ex5_8 {
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();
    }
}

//인터페이스를 구현하고 동시에 클래스를 상속받는 사례
/*

 */
package chap05_inheritance;

/*
interface PhoneInterface{} Ex5_8.java에 선언되어 있음
 */

interface MobilePhoneInterface extends PhoneInterface {
    void sendSMS();

    void receiveSMS();
}

interface MPSInterface {
    public void play();

    public void stop();
}

class PDA {
    public int calculate(int x, int y) {
        return x + y;
    }
}

class SmartPhone extends PDA implements MobilePhoneInterface, MPSInterface {
    @Override
    public void sendCall() {
        System.out.println("따르릉따르릉~~");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화 왔어요.");
    }

    @Override
    public void sendSMS() {
        System.out.println("문자갑니다.");
    }

    @Override
    public void receiveSMS() {
        System.out.println("문자왔어요.");
    }

    @Override
    public void play() {
        System.out.println("음악 연주합니다.");
    }

    @Override
    public void stop() {
        System.out.println("음악 중단합니다.");
    }

    //new method
    public void schedule() {
        System.out.println("일정 관리합니다.");
    }
}

public class Ex5_9 {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.sendSMS();
        phone.receiveSMS();
        phone.play();
        phone.stop();
        //PDA class으로부터 상속받은 method
        System.out.println("3과 5를 더하면 " + phone.calculate(3, 5));
        phone.schedule();
    }
}
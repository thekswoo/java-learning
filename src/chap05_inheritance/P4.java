package chap05_inheritance;

interface USB_4 {
    void readUSB();
    /*
        앞에 접근권한 생략되어있으면 public임
        -> 따라서 자식 클래스에서 구현할 때 항상 public을 붙여주어야함 !!!!

        추상메소드이기 때문에 자식 클래스에서 꼭 구현을 해야함
     */

    default void writeUSB() { //default -> same package
        System.out.println("Can't write to USB");
        /*
            오버라이딩을 해도 되고 안 하면 default 메소드로 호출됨
            하면 재정의한 기능을 사용하게 됨
         */
    }
}

interface USBA_4 extends USB_4 { //readUSB()
    void connectA();
}

interface USBC_4 extends USB_4 { //readUSB(), writeUSB()
    void connectC();
}

class S22_4 implements USBC_4 {
    private String name;

    public S22_4(String name) {
        this.name = name;
    }

    @Override
    public void readUSB() {
        System.out.println(name + ": USB read");
        /*
            부모클래스에서 public으로 선언되었기 때문에
            자식 클래스인 S22_4 class에서도
            꼭 오버라이딩 할 때 꼭 public으로 선언해주어야 함
         */
    }

    @Override
    public void writeUSB() {
        System.out.println(name + ": USB write");
    }

    @Override
    public void connectC() {
        System.out.println(name + ": USB connected");
    }
}

class MP3_4 implements USBA_4 {
    private String name;

    public MP3_4(String name) {
        this.name = name;
    }

    @Override
    public void readUSB() {
        System.out.println(name + ": USB read");
    }

    @Override
    public void writeUSB() {
        System.out.println(name + ": USB write");
    }

    @Override
    public void connectA() {
        System.out.println(name + ": USB connected");
    }
}

public class P4 {
    public static void main(String[] args) {
        S22_4 s22 = new S22_4("S22");
        MP3_4 mp3 = new MP3_4("MP3");
        /*
            상속은 잘 이해하는데 S22_4가 Device 타입이 될 수 있다
            USB interface 타입으로도 업캐스팅이 가능하다
            학생들은 이것을 생각을 잘 못한다
         */

        USB_4[] hub = new USB_4[]{s22, mp3};

        for (USB_4 u : hub) {
            connect(u);
            readUSB(u);
            writeUSB(u);
        }
    }

    private static void writeUSB(USB_4 u) {
        u.writeUSB();
    }

    private static void readUSB(USB_4 u) {
        u.readUSB();
    }

    private static void connect(USB_4 u) {
        //use instanceof to seek object's type
        if (u instanceof USBA_4) {
            ((USBA_4) u).connectA();
        } else if (u instanceof USBC_4) {
            ((USBC_4) u).connectC();
        }
        /*
            USB타입을 매개변수를 가지고
            다운캐스팅을 사용하여 비교 필요

            S22
            MP3
            로 비교하면 적절하지 않은 방식이다.
            A C 타입이 궁금한건데 이렇게하는것은 개별 장치를 구별하는것임
            기기가 무한하게 많으면 if문으로 무한하게 할 것인가?

            목적인 USBA인지 USBC인지 구별하기 위한 것임!!!!

            공부할 때 메소드 개수를 늘린다고 생각을 하고 코딩을 해보라
         */
    }
}
//MP3 don't have writeUSB() -> use USB_4's method
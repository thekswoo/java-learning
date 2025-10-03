package week5;

interface USB_4 {
    void readUSB();

    default void writeUSB() { //default -> same package
        System.out.println("Can't write to USB");
    }
}

interface USBA_4 extends USB_4 { //readUSB()
    default void connectA(String name) {
        System.out.println(name + ": USB-A connected");
    }

    @Override
    void readUSB(); //abstract
}

interface USBC_4 extends USB_4 { //readUSB(), writeUSB()
    default void connectC(String name) {
        System.out.println(name + ": USB-C connected");
    }

    @Override
    void readUSB(); //abstract

    @Override
    void writeUSB(); //abstract
}

class S22_4 implements USBC_4 {
    private String name;

    public S22_4(String name) {
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

    public void doConnect() {
        connectC(name);
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

    public void doConnect() {
        connectA(name);
    }
}

public class P4 {
    public static void main(String[] args) {
        S22_4 s22 = new S22_4("S22");
        MP3_4 mp3 = new MP3_4("MP3");

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
        if (u instanceof S22_4) {
            ((S22_4) u).doConnect();
        } else if (u instanceof MP3_4) {
            ((MP3_4) u).doConnect();
        }
    }
}
//MP3 don't have writeUSB() -> use USB_4's method
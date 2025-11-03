package chap06_package.usb;

public interface USB {
    void readUSB();

    default void writeUSB() {
        System.out.println("Can't write to USB");
    }
}

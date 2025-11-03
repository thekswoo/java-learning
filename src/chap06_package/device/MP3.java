package chap06_package.device;

import chap06_package.usb.*;

public class MP3 extends Device implements USBA {
    private final int price = 120;

    public MP3(String name, int year) {
        super(name, year);
    }

    @Override
    public void readUSB() {
        System.out.println(super.getName() + ": USB read");
    }

    @Override
    public void connectA() {
        System.out.println(super.getName() + ": USB-A connected");
    }

    @Override
    public String getInfor() {
        return super.getName() + " " + super.getYear() + " $" + price;
    }
}
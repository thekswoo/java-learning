package week6.device;

import week6.usb.*;

public class S22 extends week6.device.Device implements USBC {
    private final int price = 1400;

    public S22(String name, int year) {
        super(name, year);
    }

    @Override
    public void readUSB() {
        System.out.println(super.getName() + ": USB read");
    }

    @Override
    public void writeUSB() {
        System.out.println(super.getName() + ": USB write");
    }

    @Override
    public void connectC() {
        System.out.println(super.getName() + ": USB-C connected");
    }

    @Override
    public String getInfor() {
        return super.getName() + " " + super.getYear() + " $" + price;
    }
}
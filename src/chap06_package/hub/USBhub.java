package chap06_package.hub;

import chap06_package.usb.USB;

public class USBhub {
    private int USB_SIZE = 4;
    private int count = 0;
    private USB[] devices = new USB[USB_SIZE];


    public void addDevice(USB d) {
        if (count < devices.length) {
            devices[count] = d;
            count++;
        }
    }

    public void readUSBs() {
        for (int i = 0; i < count; i++) {
            devices[i].readUSB();
        }
    }

    public void writeUSBs() {
        for (int i = 0; i < count; i++) {
            devices[i].writeUSB();
        }
    }
}
package chap06_package.hub;


import chap06_package.device.*;
import chap06_package.usb.*;

public class P1 {
    static void printInfor(Device device) {
        System.out.println(device.getInfor());
        if (device instanceof USBA) {
            ((USBA) device).connectA();
        } else if (device instanceof USBC) {
            ((USBC) device).connectC();
        }
    }

    public static void main(String[] args) {
        S22 s22 = new S22("S22", 2022);
        MP3 mp3 = new MP3("MP3", 2005);
        TV tv = new TV("TV", 2017);

        Device[] devices = new Device[]{s22, mp3, tv};
        USBhub hub = new USBhub();

        for (Device d : devices) {
            printInfor(d);
            if (d instanceof USB) {
                hub.addDevice((USB) d);
            }
        }

        System.out.println();
        hub.readUSBs();
        System.out.println();
        hub.writeUSBs();
    }
}

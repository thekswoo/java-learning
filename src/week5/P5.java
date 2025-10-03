package week5;

abstract class Device {
    private String name;
    private int year;

    Device(String name, int year) {
        this.name = name;
        this.year = year;
    }

    protected String getName() {
        return name;
    }

    protected int getYear() {
        return year;
    }

    public abstract String getInfor();
}

interface USB {
    void readUSB();

    default void writeUSB() {
        System.out.println("Can't write to USB");
    }
}


interface USBA extends USB {
    default void connectA(String name) {
        System.out.println(name + ": USB-A connected");
    }

    @Override
    void readUSB();
}
//read


interface USBC extends USB {
    default void connectC(String name) {
        System.out.println(name + ": USB-C connected");
    }

    @Override
    void readUSB();

    @Override
    void writeUSB();

}
//read, write

class S22 extends Device implements USBC {
    private final int price = 1400;

    public S22(String name, int year) {
        super(name, year);
    }

    public void doConnect() {
        connectC(super.getName());
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
    public String getInfor() {
        return super.getName() + " " + super.getYear() + " $" + price;
    }
}

class MP3 extends Device implements USBA {
    private final int price = 120;

    public MP3(String name, int year) {
        super(name, year);
    }

    public void doConnect() {
        connectA(super.getName());
    }

    @Override
    public void readUSB() {
        System.out.println(super.getName() + ": USB read");
    }

    @Override
    public String getInfor() {
        return super.getName() + " " + super.getYear() + " $" + price;
    }
}

class TV extends Device {
    private final int price = 5000;

    public TV(String name, int year) {
        super(name, year);
    }

    @Override
    public String getInfor() {
        return super.getName() + " " + super.getYear() + " $" + price;
    }
}


public class P5 {
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

    private static void printInfor(Device device) {
        System.out.println(device.getInfor());
        if (device instanceof S22) {
            ((S22) device).doConnect();
        } else if (device instanceof MP3) {
            ((MP3) device).doConnect();
        }
    }

    private static class USBhub {
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
            for(int i = 0; i < count; i++) {
                devices[i].readUSB();
            }
        }

        public void writeUSBs() {
            for(int i = 0; i < count; i++) {
                devices[i].writeUSB();
            }
        }
    }
}

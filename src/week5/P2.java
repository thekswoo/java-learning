package week5;

class Device_2 {
    private String name;
    private int year;

    Device_2(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getInfor() {
        return name + " " + year;
    }
}

class S22_2 extends Device_2 {

    S22_2(String name, int year) {
        super(name, year);
    }

    @Override
    public String getInfor() {
        int price = 1400;
        return super.getInfor() + " $" + price;
    }
}

class MP3_2 extends Device_2 {

    MP3_2(String name, int year) {
        super(name, year);
    }

    @Override
    public String getInfor() {
        int price = 120;
        return super.getInfor() + " $" + price;
    }
}

class TV_2 extends Device_2 {

    TV_2(String name, int year) {
        super(name, year);
    }

    @Override
    public String getInfor() {
        int price = 5000;
        return super.getInfor() + " $" + price;
    }
}

public class P2 {
    public static void main(String[] args) {
        S22_2 s22 = new S22_2("S22", 2022);
        MP3_2 mp3 = new MP3_2("MP3", 2022);
        TV_2 tv = new TV_2("Tv", 2022);

        Device_2[] devices = {s22, mp3, tv};

        for (Device_2 device : devices) {
            printInfor(device);
        }

    }

    public static void printInfor(Device_2 device) {
        System.out.println(device.getInfor());
    }
}

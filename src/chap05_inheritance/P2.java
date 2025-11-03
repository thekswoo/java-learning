package chap05_inheritance;

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
    /*
        TV_2라는 자식클래스에서 name과 year 필드를 다시 새로 선언하지 않고
        부모클래스에 있는 필드를 끌어와서 사용
    */
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
        /*
            if else 로 instanceof 구별해서 할 필요가 없음
            다형성을 제대로 이해하면 할 필요가 없음
            if문 하지말라고 낸건데 if문으로 하면 안됨
            감점사유가 됨
            무엇을 공부하는지 생각을 해야함
            다형성을 제대로 이해한건지 물어보는거라 감점을 하는 것이 맞다

            어디부분에서 다형성을 활용하는지 생각
         */
    }
}

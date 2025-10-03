package week5;

class People {
    private String name;
    private String Ssn;

    public People(String name, String Ssn) {
        this.name = name;
        this.Ssn = Ssn;
    }
    public String getName() {
        return name;
    }
    public String getSsn() {
        return Ssn;
    }
}

class Student extends People {
    private int Id;

    public Student(String name, String Ssn, int Id) {
        super(name, Ssn);
        this.Id = Id;
    }
    public int getId() {
        return Id;
    }
}

public class P1 {
    public static void main(String[] args) {
        Student s = new Student("dlwlrma","930516",12231234);
        System.out.println("name: " + s.getName());
        System.out.println("ssn: " + s.getSsn());
        System.out.println("id: " + s.getId());
    }
}

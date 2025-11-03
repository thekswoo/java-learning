package chap06_package;

class Point {
    private int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point(" + this.x + ", " + this.y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        Point o = (Point) obj;
        if (this.x == o.x && this.y == o.y) {
            return true;
        }
        return false;
    }
}

class Circle extends Point {
    private int r;

    Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public String toString() {
        return super.toString() + ", r = " + r;
    }

    @Override
    public boolean equals(Object obj) {
        Point p = (Point) obj;
        Circle c = (Circle) obj;
        if (super.equals(p) && this.r == c.r) {
            return true;
        } else {
            return false;
        }
    }
}

public class P2 {
    public static void main(String[] args) {
        Circle c1 = new Circle(3, 4, 5);
        Circle c2 = new Circle(3, 4, 5);
        Circle c3 = new Circle(3, 4, 6);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        if (c1.equals(c2)) {
            System.out.println("c1 == c2");
        } else {
            System.out.println("c1 != c2");
        }
        if (c1.equals(c3)) {
            System.out.println("c1 == c3");
        } else {
            System.out.println("c1 != c3");
        }
    }
}
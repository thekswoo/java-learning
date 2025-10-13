package week7;

import java.util.*;

class Point {
    private int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class P1 {
    public static void main(String[] args) {
        Vector<Point> v = new Vector<Point>();

        v.add(new Point(5, 16));
        v.add(new Point(2, 12));
        v.add(new Point(11, 4));

        Iterator<Point> it = v.iterator();
        while (it.hasNext()) {
            Point p = it.next();
            System.out.println("(" + p.getX() + "," + p.getY() + ")");
        }
    }
}

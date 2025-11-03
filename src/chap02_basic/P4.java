package chap02_basic;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Center of circle: ");
        int cx = scan.nextInt();
        int cy = scan.nextInt();

        System.out.print("Radius: ");
        double r = scan.nextDouble();

        System.out.print("Point: ");
        int px = scan.nextInt();
        int py = scan.nextInt();

        double dis = Math.sqrt((cx-px)*(cx-px) + (cy-py)*(cy-py));

        if(dis > r){
            System.out.print("not in the circle.");
        }else{
            System.out.print("inside the circle.");
        }
    }
}

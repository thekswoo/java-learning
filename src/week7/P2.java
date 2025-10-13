package week7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> a = new ArrayList<String>();
        while (true) {
            System.out.print("? ");
            String name = scanner.next();
            if (name.equals("exit")) {
                break;
            } else {
                a.add(name);
            }
        }

        Iterator<String> it = a.iterator();
        String longest_name = "";
        while (it.hasNext()) {
            String str = it.next();
            System.out.print(str + " ");

            if (str.length() > longest_name.length()) {
                longest_name = str;
            }
        }
        System.out.println();

        System.out.print("the longest name: " + longest_name);
    }
}

package chap05_inheritance;

import java.util.Scanner;

abstract class Stack {
    public abstract int length();

    public abstract int capacity();

    public abstract String pop();

    public abstract boolean push(String str);

}

class StringStack extends Stack {
    private String[] arr;
    private int tos;

    StringStack(int capacity) {
        tos = -1;
        arr = new String[capacity];
    }

    @Override
    public int length() {
        return tos + 1;
    }

    @Override
    public int capacity() {
        return arr.length;
    }

    @Override
    public String pop() {
        if (length() == 0) {
            return null;
        }
        return arr[tos--];
    }

    @Override
    public boolean push(String str) {
        if (length() == capacity()) {
            return false;
        }
        arr[++tos] = str;
        return true;
    }
}

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("size of stack: ");
        int capacity = scanner.nextInt();

        scanner.nextLine(); //delete buffer

        StringStack s = new StringStack(capacity);

        while (true) {

            System.out.print("input: ");
            String str = scanner.next();
            if (str.equals("exit")) {
                break;
            }
            if (!s.push(str)) {
                System.out.println("stack is full!");
            }
        }

        System.out.print("pop all strings: ");
        while(s.length() > 0) {
            System.out.print(s.pop());
            System.out.print(" ");
        }
    }
}

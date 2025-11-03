package chap06_package;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.Math;

public class P5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a string: ");
        String s = sc.nextLine();

        int len = s.length();
        int startIndex = (int)(Math.random() * len);
//        int startIndex = sc.nextInt();
        String subString = s.substring(startIndex);

        StringTokenizer ts = new StringTokenizer(subString, " ");
        int wordCount = ts.countTokens();

        System.out.print("startIndex = ");
        System.out.print(startIndex);

        System.out.print(", #words = ");
        System.out.println(wordCount);

        System.out.println(subString);
    }
}

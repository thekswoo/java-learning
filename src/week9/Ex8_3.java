//한글텍스트 파일 읽기(문자 집합 지정이 잘못된 경우)
/*
    InputStreamReader의 문자 집합을 US-ASCII로 지정하여 한글 파일을 읽고 출력하라.
 */
package week9;

import java.io.*;

public class Ex8_3 {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("./Temp/hangul.txt");
            in = new InputStreamReader(fin, "US-ASCII");
            int c;

            System.out.println("인코딩 문자 집합은 " + in.getEncoding());
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }

            in.close();
            fin.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");

        }
    }
}

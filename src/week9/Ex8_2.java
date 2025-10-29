//InputStreamReader로 한글 텍스트 파일 읽기
/*
    InputStreamReader를 이용하 MS949 문자 집합으로 한글 텍스트 파일을 읽고 출력하라.
 */

package week9;

import java.io.*;

public class Ex8_2 {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;

        try {
            fin = new FileInputStream("./Temp/test.txt");
            in = new InputStreamReader(fin, "UTF-8");
            int c;

            System.out.println("인코딩 문자 집합은 " + in.getEncoding());
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}

//FileReader로 텍스트 파일 읽기
/*
    FileReader를 이용하여 c:\windows\system.ini 파일을 읽어 화면에 출력하 프로그램을 작성하라.
    System.ini는 텍스트 파일이다.
 */
package chap08_stream;

import java.io.*;

public class Ex8_1 {
    public static void main(String[] args) {
        FileReader fin = null;
        try {
            fin = new FileReader("./text.ini");
            int c;
            while ((c = fin.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

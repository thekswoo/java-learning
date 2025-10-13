//HashMap을 이용하여 (영어,한글) 단어 쌍의 저장 검색
/*
    (영어,한글) 단어를 쌍으로 해시맵에 저장하고 영어로 한글을 검색하는 프로그램을 작성하라.
    "exit"이 입력되면 프로그램을 종료한다.
 */

package week7;

import java.util.*;

public class Ex7_5 {
    public static void main(String[] args) {
        HashMap<String, String> dic = new HashMap<String, String>();

        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("찾고 싶은 단어는?");
            String eng = scanner.next();

            if (eng.equals("exit")) {
                System.out.println("종료합니다...");
                break;
            }

            String kor = dic.get(eng);
            if (kor == null) {
                System.out.println(eng + "는 없는 단어입니다.");
            } else {
                System.out.println(kor);
            }
        }
        scanner.close();
    }
}

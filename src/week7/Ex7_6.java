//HashMap을 이용하여 자바 과목의 이름과 점수 관리
/*
    해시맵을 이용하여 학생의 이름과 자바 점수를 기록하는 프로그램을 작성하라
 */

package week7;

import java.util.*;

public class Ex7_6 {
    public static void main(String[] args) {
        HashMap<String, Integer> javaScore = new HashMap<String, Integer>();

        javaScore.put("김성동", 97);
        javaScore.put("황기태", 88);
        javaScore.put("김남윤", 98);
        javaScore.put("이재문", 70);
        javaScore.put("한원선", 99);

        System.out.println("HashMap의 요소 개수 :" + javaScore.size());

        Set<String> keys = javaScore.keySet(); //set Iterator 사용 방법
        Iterator<String> it = keys.iterator();

        while (it.hasNext()) {
            String name = it.next();
            int score = javaScore.get(name);
            System.out.println(name + " :" + score);
        }
    }
}

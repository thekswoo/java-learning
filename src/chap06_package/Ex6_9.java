//StringTokenizer 클래스 메소드 활용
/*
    "홍길동/장화/홍련/콩쥐/팥쥐"
    문자열을 '/'를 구분 문자로 하여 토큰을 분리하여 각 토큰을 출력하라.
 */
package chap06_package;

import java.util.StringTokenizer;

public class Ex6_9 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}

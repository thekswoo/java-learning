//정수만 다루는 Vector<Integer> 컬렉션 활용
/*
    정수만 다루는 벡터를 생성하고, 활용하는 기본 사례를 보인다.
 */
package week7;

import java.util.Vector;

public class Ex7_1 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(5);
        v.add(4);
        v.add(-1);

        v.add(2,100);

        System.out.println("벡터 내의 요소 객체 수 : " + v.size());
        System.out.println("벡터의 현재 용량 : " + v.capacity());

        for(int i = 0; i< v.size(); i++){
            int n = v.get(i);
            System.out.println(n);
        }

        int sum = 0;
        for(int i = 0; i< v.size(); i++){
            int n = v.elementAt(i); //과거의 메소드
            sum += n;
        }
        System.out.println("벡터에 있는 정수 합 : " + sum);
    }
}

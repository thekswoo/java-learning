//가비지의 발생
//다음 코드에서 언제 가비지가 발생하는지 설명하라
package chap04_class;

public class Ex4_9 {
    public static void main(String[] args) {
        String a = new String("Good");
        String b = new String("Bad");
        String c = new String("Normal");
        String d, e;
        a = null; //"Good" garbage 발생
        d = c; //d도 "Bad" 참조
        c = null;// c가 "Normal"참조를 더이상 하지 않지만 d가 참조 중이기 때문에 "Normal"은 garbage 발생하지 않음
        //결론적으로
        //"Good"만 garbage 발생
        //a,c와 e는 아무 String 객체 참조를 하지 않고 있다. -> 얘네들은 메모리 관리 대상이 아니기 때문에 가비지라고 취급은 안 해도 됨
    }
}

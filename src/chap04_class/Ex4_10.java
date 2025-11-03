//멤버의 접근 지정자

//다음 코드의 두 클래스 Sample과 AccessEx 클래스는 동일한 패키지에 저장된다.
//컴파일 오류를 찾아내고 이유를 설명하라

package chap04_class;

class Sample {
    public int a;
    private int b;
    int c;
}

public class Ex4_10 {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 5;
        //aClass.b = 10

        // complie error
        //Sample class에서 b는 Sample class 안에서만 접근이 가능한 private으로 선언되어 있기 때문에
        //같은 package라도 다른 class인 Ex4_10라는 class에서는 접근이 불가능하다 -> complie error 발생하는 이유
        aClass.c = 20;//default 접근 지정자로 자동으로 설정
    }
}

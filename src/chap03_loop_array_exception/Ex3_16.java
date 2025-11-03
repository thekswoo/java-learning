package chap03_loop_array_exception;

public class Ex3_16 {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        intArray[0] = 0;
        try {
            for (int i = 0; i < 5; i++) {
                intArray[i + 1] = i + 1 + intArray[i]; //i가 4일때 범위 초과 예외(ArrayIndexOutOfBoundsExeption) 발생
                System.out.println("intArray[" + i + "] = " + intArray[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
        }
    }
}


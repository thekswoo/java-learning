package chap03_loop_array_exception;
//비정방형 배열의 생성과 접근

/*
다음 그림과 같은 비정방형 배열을 만들어 값을 초기화하고 출력하시오
10 11 12
20 21
30 31 32
40 41
*/
public class Ex3_11 {
    public static void main(String[] args) {
        int intArray[][] = new int[4][];
        intArray[0] = new int[3];
        intArray[1] = new int[2];
        intArray[2] = new int[3];
        intArray[3] = new int[2];

        for(int i=0;i<intArray.length;i++){
            for(int j=0;j<intArray[i].length;j++){
                intArray[i][j] = 10*(i+1) + j;
            }
        }

        for(int i=0;i<intArray.length;i++){
            for(int j=0;j<intArray[i].length;j++){
                System.out.print(intArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}

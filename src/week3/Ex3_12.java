package week3;

public class Ex3_12 {
    static int[] makeArray(){
        int temp[] = new int[4]; //배열생성
        for(int i=0;i<temp.length;i++){
            temp[i]=i;
        }
        return temp;
    }

    public static void main(String[] args) {
        int intArray[];
        intArray = makeArray();//메소드로부터 배열 전달 받음
        for(int i=0;i<intArray.length;i++){
            System.out.print(intArray[i]+" ");
        }
    }
}

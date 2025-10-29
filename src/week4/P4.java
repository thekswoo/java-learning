package week4;

class ArrayUtil {
    public static int[] concat(int[] arr1, int[] arr2) {
        int len = arr1.length + arr2.length;
        int[] arr = new int[len];

        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr[i + arr1.length] = arr2[i];
        }

        return arr;
    }

    public static void print(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }
}

public class P4 {
    public static void main(String args[]) {
        int[] array1 = {1993, 0, 5, 1, 6};
        int[] array2 = {1990, 0, 2, 1, 2};
        int[] array3;

        array3 = ArrayUtil.concat(array1, array2);
        ArrayUtil.print(array3);
    }
}

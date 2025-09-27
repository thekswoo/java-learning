//package week4;

public class P4 {
    public static void main(String[] args) {
        int[] array1 = {1993, 0, 6, 1, 6};
        int[] array2 = {1990, 0, 2, 1, 2};

        int[] array3;

        array3= ArrayUtil.concat(array1, array2);

        ArrayUtil.print(array3);
    }
}

class ArrayUtil {
    public static int[] concat(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }
        return result;
    }

    public static void print(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(" ]");
    }
}
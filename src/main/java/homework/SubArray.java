package homework;

import java.util.ArrayList;
import java.util.HashSet;

public class SubArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 2, 1};
        int[] array2 = {3, 2, 1, 4, 7};


        int[] array3 = {0, 0, 0, 0, 0};
        int[] array4 = {0, 0, 0, 0, 0};

        outputArray(array1);
        outputArray(array2);

        System.out.println("Длина общего наибольшего подмассива " + FindMaxLength(array1, array2));

        outputArray(array4);
        outputArray(array4);
        System.out.println("Длина общего наибольшего подмассива " + FindMaxLength(array3, array4));
    }

    static int FindMaxLength(int[] array1, int[] array2) {

        int[][] tempArr = new int[array1.length + 1][array2.length + 1];

        for (int i = array1.length - 1; i >= 0; i--) {
            for (int j = array2.length - 1; j >= 0; j--) {
                if (array1[i] == array2[j])
                    tempArr[i][j] = tempArr[i + 1][j + 1] + 1;
            }
        }
        int max = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                max = Math.max(max, tempArr[i][j]);
            }
        }

        return max;
    }

    public static void outputArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

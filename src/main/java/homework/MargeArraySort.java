package homework;

public class MargeArraySort {
    public static void main(String[] args) {

        int[] sortArray = { 5, 1, 6, 2, 3, 4 };

        printArray(sortArray);

        mergeSortArray(sortArray, sortArray.length);

        printArray(sortArray);

    }

    public static void mergeSortArray(int[] arr, int length) {
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }
        for (int i = mid; i < length; i++) {
            rightArr[i - mid] = arr[i];
        }
        mergeSortArray(leftArr, mid);
        mergeSortArray(rightArr, length - mid);

        merge(arr, leftArr, rightArr, mid, length - mid);

    }

    public static void merge(
            int[] arr, int[] leftArr, int[] rightArr, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            }
            else {
                arr[k++] = rightArr[j++];
            }
        }
        while (i < left) {
            arr[k++] = leftArr[i++];
        }
        while (j < right) {
            arr[k++] = rightArr[j++];
        }
    }

    static void printArray (int[] arr) {
        for (int num :arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

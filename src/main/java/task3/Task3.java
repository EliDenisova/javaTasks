package task3;

public class Task3 {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 1, 1, 0, 1, 1, 1};

        int count = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 ) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(max);
    }
}
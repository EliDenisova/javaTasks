package hw2_0902;

public class Solution {
    public static void main(String[] args) {

        simpleNum();
    }

    public static void simpleNum() {
        for (int i = 1; i < 1001; i++) {
            if (isSimple(i))  System.out.println(i);
        }
    }

    public static boolean isSimple(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}

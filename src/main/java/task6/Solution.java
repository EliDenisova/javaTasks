package task6;

public class Solution {
    public static void main(String[] args) {

        System.out.println(isPalindrome("njf"));
    }

    static boolean isPalindrome(String str) {
        char[] strX = str.toCharArray();
        int y = strX.length - 1;
        for (int i = 0; i < strX.length/2; i++) {
            if (strX[i] != strX[y - i]){

                return false;
            }
        }
        return true;
    }
}

package task5;

public class Solution {
    public static void main(String[] args) {
        System.out.println(stringLength(6, 'a', 'b'));
    }

    public static StringBuilder stringLength(int n, char c1, char c2) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i += 2) {
            result.append(c1);
            result.append(c2);
        }
        return result;
    }
}

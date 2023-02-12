package hw1_0902;

public class Solution {
    public static void main(String[] args) {
        nthTriangularNumber(4);
        nFactorial(5);
    }

    public static void nthTriangularNumber(int n) {

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void nFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}


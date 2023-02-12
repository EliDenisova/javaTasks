package hw3_0902;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int x = scanner.nextInt();
        System.out.println("Введите арифметическое действие ");
        char arithmeticAction = scanner.next().charAt(0);
        System.out.println("Введите число ");
        int y = scanner.nextInt();

        calculate(x, y, arithmeticAction);
    }

    static void calculate(int x, int y, char arithmeticAction) {

        switch (arithmeticAction) {
            case '+' -> sum(x, y);
            case '-' -> subtraction(x, y);
            case '*' -> multiplication(x, y);
            case '/' -> division(x, y);
        }
    }

    static void sum(int x, int y) {
        System.out.println(x + y);
    }

    static void subtraction(int x, int y) {
        System.out.println(x - y);
    }

    static void multiplication(int x, int y) {
        System.out.println(x * y);
    }

    static void division(int x, int y) {
        System.out.println(x / y);
    }
}

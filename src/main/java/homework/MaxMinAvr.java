package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MaxMinAvr {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(0, 100));
        }

        System.out.println(list);

        getMin(list);
        getMax(list);
        getAvr(list);
    }

    static void getMin(List<Integer> list) {

        int min = list.get(0);
        for (Integer num : list) {
            if (min > num) {
                min = num;
            }
        }
        System.out.printf("Минимальное число в массиве - %d \n", min);
    }

    static void getMax(List<Integer> list) {

        int max = list.get(0);
        for (Integer num : list) {
            if (max < num) {
                max = num;
            }
        }
        System.out.printf("Максимальное число в массиве - %d \n", max);
    }

    static void getAvr(List<Integer> list) {

        int avr = 0;
        for (Integer num: list) {
            avr += num;
        }
        double avrD = (double)avr;
        avrD = avrD / list.size();
        System.out.printf("Среднее арифметическое число в массиве - %f", avrD);
    }
}

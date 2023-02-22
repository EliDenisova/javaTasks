package task;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(0, 100));
        }

        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        Collections.sort(list);

        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
package homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class DeleteEvenNumbers {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(0, 100));
        }
        printList(list);

        deleteEvenNumbers(list);
    }

    static void printList(List<Integer> list) {

        for (Integer num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void deleteEvenNumbers(List<Integer> list) {

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }

        }
        printList(list);
    }
}

package task;

import java.util.*;

public class Planet {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Меркурий");
        list.add("Венера");
        list.add("Земля");
        list.add("Марс");
        list.add("Земля");
        list.add("Сатурн");
        list.add("Сатурн");
        list.add("Нептун");

        repetitions(list);
        delete(list);
    }

    static void repetitions(List<String> list) {

        Collections.sort(list);
        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
            } else {
                System.out.println(list.get(i) + " встречается " + count + " раз");
                count = 1;
            }
        }
        System.out.println(list.get(list.size() - 1) + " встречается " + count + " раз");
    }

    static void delete(List<String> list) {
        Iterator<String> iterator = list.iterator();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                list.remove(list.get(i));
            }
        }
        System.out.println(list);
    }
}

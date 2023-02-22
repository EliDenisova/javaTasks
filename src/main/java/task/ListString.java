package task;

import java.util.ArrayList;
import java.util.List;

public class ListString {
    public static void main(String[] args) {
        List<ArrayList<String>> list = new ArrayList<>();

        ArrayList<String> eList = new ArrayList<>();
        eList.add("басни");
        eList.add("мартышка и очки");

        list.add(eList);

        for (List<String> item : list) {
            if (item.get(0).equals("басни")) {
                System.out.println(item);
            }
        }
    }
}

package homework;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {

        HashMap<String,HashSet<Integer>> phoneBook = new HashMap<>();
        HashSet<Integer> numbers = new HashSet<>();

        String n1 = "Аня";
        numbers.add(56561);
        numbers.add(26566);
        phoneBook.put(n1, numbers);

        System.out.println(phoneBook);
        menu(phoneBook);

    }

    static void menu(Map<String, HashSet<Integer>> phoneBook) {

        System.out.println("Введите номер операции для выбора действия: \n" +
                "1. Добавить контакт.\n" +
                "2. Посмотреть всю телефонную книгу\n" +
                "3. Найти контакт.\n" +
                "4. Удалить контакт.\n");

        int num = readInt();

        switch (num) {
            case 1 -> addNumber(phoneBook);
            case 2 -> showPhoneBook(phoneBook);
            case 3 -> findNumber(phoneBook);
            case 4 -> deleteNumber(phoneBook);
        }
    }

    static void deleteNumber(Map<String, HashSet<Integer>> phoneBook) {

        System.out.println("введите имя контакта для удаления.");
        String name = readStr();
        phoneBook.remove(name);

    }

    static void findNumber(Map<String, HashSet<Integer>> phoneBook) {
        System.out.println("Введите имя контакта для поиска.");
        String name = readStr();

        Set<Integer> value = phoneBook.get(name);

        showPhoneBook(phoneBook);
    }

    static void addNumber(Map<String, HashSet<Integer>> phoneBook) {

        System.out.println("Введите имя.");
        String name = readStr();
        System.out.println("Введите номер.");
        int number = readInt();

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(number);
        phoneBook.put(name, numbers);

        showPhoneBook(phoneBook);
    }

    static void showPhoneBook(Map<String, HashSet<Integer>> phoneBook) {
        for (Map.Entry entry: phoneBook.entrySet()) {

            System.out.println(entry);
        }
    }

    static int readInt() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }
    static String readStr() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }
}

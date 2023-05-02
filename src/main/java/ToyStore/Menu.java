package ToyStore;

import java.util.Scanner;

public class Menu {
    public Menu() {
    }

    public static void menu() {
        int max = 100;
        int rnd = (int) (Math.random() * ++max);
        ToyStorage store = new ToyStorage();
        Scanner scanner = new Scanner(System.in);
        DrawingOfToys drawingOfToys = new DrawingOfToys();
        Toy toy1 = new Toy("Мяч", 10, 0);
        Toy toy2 = new Toy("Кукла", 10, 20);
        Toy toy3 = new Toy("Конструктор замок", 10, 70);
        Toy toy4 = new Toy("Мишка", 10, 50);
        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);

        while(true) {
            while(true) {

                System.out.println("1. Добавить новую игрушку в розыгрыш");
                System.out.println("2. Изменить вес вероятности выигрыша");
                System.out.println("3. Начать розыгрыш");
                System.out.println("4. Показать список всех игрушек");
                System.out.println("5. Показать список всех выигрышных игрушек");
                System.out.println("6. Выход");
                int choice = scanner.nextInt();
                scanner.nextLine();
                if (choice == 1) {
                    addNewToy(store, scanner);
                } else if (choice == 2) {
                    store.changeWeight(scanner);
                } else if (choice == 3) {
                    drawingOfToys.drawToy(store.toys, store.prizeToys);
                } else if (choice == 4) {
                    printAllToys(store);
                } else if (choice == 5) {
                    printAllPrizeToys(store);
                } else if (choice == 6) {
                    scanner.close();
                    return;
                }
            }
        }
    }

    public static void addNewToy(ToyStorage store, Scanner scanner) {
        String title = scanner.nextLine();
        int count = scanner.nextInt();
        int weight = scanner.nextInt();
        store.addToy(new Toy(title, count, weight));
    }


    public static void printAllToys(ToyStorage store) {
        System.out.println("Список всех игрушек:");
       for (Toy toy : store.toys) {
           System.out.println(toy);
       }
    }
    public static void printAllPrizeToys(ToyStorage store) {
        System.out.println("Список всех выигрышных игрушек:");
       for (Toy toy : store.prizeToys) {
           System.out.println(toy);
       }
    }

}

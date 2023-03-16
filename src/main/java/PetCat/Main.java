package PetCat;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Vasya", 1);
        Cat cat = new Cat("Murka", "orange", "smale", 50);

        person.eat();
        cat.ask();
        System.out.println("сытость кота " + cat.setSatiety(50));
        person.giveFood();
        person.voce();
        cat.eat();
        cat.voce();
        System.out.println("сытость кота " + cat.setSatiety(100));
    }
}

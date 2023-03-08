package PetCat;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Vasya", 1);
        Cat cat = new Cat("Murka", "orange", "smale");

        person.eat();
        cat.ask();
        person.giveFood();
        person.voce();
        cat.eat();
        cat.voce();
    }
}

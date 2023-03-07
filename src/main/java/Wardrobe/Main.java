package Wardrobe;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("vasya");
        Wardrobe wardrobe = new Wardrobe("шкаф", "береза", 3, 2);

        System.out.println(person.toString());
        person.go();
        person.openDoor();
        wardrobe.openDoor();
    }
}

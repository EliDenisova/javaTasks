package Wardrobe;

public class Person implements walking, opening{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void go() {
        System.out.println("подходит к шкафу");
    }

    @Override
    public void openDoor() {
        System.out.println("открывает дверцу");
    }

    @Override
    public String toString() {
        return name;
    }
}

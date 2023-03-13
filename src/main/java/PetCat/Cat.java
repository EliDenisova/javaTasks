package PetCat;

public class Cat extends Animal implements Say, Eat, Ask{
    public Cat(String name, String color, String size) {
        super(name, color, size);
    }


    @Override
    public void ask() {
        System.out.println("Втал на задние лапки и помахал передними.");
    }

    @Override
    public void eat() {
        System.out.println("кушает");
    }

    @Override
    public void voce() {
        System.out.println("говорит: Мур - мур");
    }


}

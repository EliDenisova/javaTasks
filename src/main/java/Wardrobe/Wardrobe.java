package Wardrobe;

public class Wardrobe extends Furniture implements opening{
    private int doorCount;
    private int height;

    public Wardrobe(String title, String color, int doorCount, int height) {
        super(title, color);
        this.doorCount = doorCount;
        this.height = height;
    }

    @Override
    public void openDoor() {
        System.out.println("дверца открыта");
    }
}

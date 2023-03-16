package PetCat;

public abstract class Animal implements Comparable<Animal>{
    private String name;
    private String color;
    private String size;

    private int satiety;

    public Animal(String name, String color, String size, int satiety) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.satiety = satiety;
    }

    public int getSatiety() {
        return satiety;
    }

    public int setSatiety(int satiety) {
        this.satiety = satiety;
        return satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public int hashCode() {
        int result = 15;

        result = 31 * result + (name == null ? 0 : name.hashCode());
        result = 31 * result + (color == null ? 0 : color.hashCode());
        result = 31 * result + (size == null ? 0 : size.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Animal animal = (Animal) obj;
        return name.equals(animal.name) && color.equals(animal.color) && size.equals(animal.size);
    }

    @Override
    public int compareTo(Animal o) {
        return this.getSatiety() - o.getSatiety();
    }
}

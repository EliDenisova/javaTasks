package PetCat;

public class Person implements Eat, Feed, Say{

    private String name;
    private int petCount;


    public Person(String name, int petCount) {
        this.name = name;
        this.petCount = petCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPetCount() {
        return petCount;
    }

    public void setPetCount(int petCount) {
        this.petCount = petCount;
    }

    @Override
    public void eat() {
        System.out.println("Сел обедать");
    }

    @Override
    public void giveFood() {
        System.out.println("наложил питомцу корм.");
    }

    @Override
    public void voce() {
        System.out.println("Приятного аппетита.");
    }


    @Override
    public int hashCode() {
        int result = 15;
        result = 31 * result + (name == null ? 0 : name.hashCode());
        result = 31 * result + petCount;

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
        Person person = (Person) obj;
        return petCount == person.petCount && name.equals(person.name);
    }
}

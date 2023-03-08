package GeoWithResearch;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", 50);
        Person vasya = new Person("Вася", 55);
        Person masha = new Person("Маша", 25);
        Person jane = new Person("Женя", 27);
        Person ivan = new Person("Ваня", 5);
        Person kate = new Person("Катя", 1);
        GeoTree gt = new GeoTree();
        gt.appendParen(irina, jane);
        gt.appendParen(irina, masha);
        gt.appendParen(vasya, jane);
        gt.appendParen(vasya, masha);
        gt.appendParen(jane, ivan);
        gt.appendParen(masha, kate);
        gt.appendGrandparent(irina, ivan);
        gt.appendGrandparent(irina, kate);
        gt.appendGrandparent(vasya, ivan);
        gt.appendGrandparent(vasya, kate);
        gt.appendAunt(jane, kate);
        gt.appendAunt(masha, ivan);

        System.out.println(new Research(gt).spend(vasya,
                Relationship.grandparent));
    }

}

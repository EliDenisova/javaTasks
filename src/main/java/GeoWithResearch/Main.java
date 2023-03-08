package GeoWithResearch;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", 50);
        Person vasya = new Person("Вася", 55);
        Person masha = new Person("Маша", 25);
        Person jane = new Person("Женя", 27);
        Person ivan = new Person("Ваня", 5);
        Person kate = new Person("Катя", 1);
        GeoTreeInterface gt = new GeoTree();
        gt.addRelationship(irina, jane, Relationship.children);
        gt.addRelationship(irina, masha, Relationship.children);
        gt.addRelationship(vasya, jane, Relationship.children);
        gt.addRelationship(vasya, masha, Relationship.children);
        gt.addRelationship(jane, ivan, Relationship.children);
        gt.addRelationship(masha, kate, Relationship.children);
        gt.addRelationship(irina, ivan, Relationship.Grandchild);
        gt.addRelationship(irina, kate, Relationship.Grandchild);
        gt.addRelationship(vasya, ivan, Relationship.Grandchild);
        gt.addRelationship(vasya, kate, Relationship.Grandchild);
        gt.addRelationship(jane, kate, Relationship.NEPHEW_NIECE);
        gt.addRelationship(masha, ivan, Relationship.NEPHEW_NIECE);

        System.out.println(new Research(gt).spend(vasya,
                Relationship.Grandchild));

        System.out.println(new Research(gt).allRelationships(vasya));
        System.out.println(new Research(gt).findRelationships(vasya, Relationship.children));
    }

}

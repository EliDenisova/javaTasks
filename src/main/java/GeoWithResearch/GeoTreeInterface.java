package GeoWithResearch;

import java.util.ArrayList;

public interface GeoTreeInterface {
    void addRelationship(Person person1, Person person2, Relationship relationship);

    boolean hasRelationship(Person p1, Person p2);

    ArrayList<Node> getTree();

}

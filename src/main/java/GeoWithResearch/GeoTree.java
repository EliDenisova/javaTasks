package GeoWithResearch;

import java.util.ArrayList;

public class GeoTree implements GeoTreeInterface {
    private ArrayList<Node> tree = new ArrayList<>();

    @Override
    public void addRelationship(Person person1, Person person2, Relationship relationship) {
        if (!hasRelationship(person1, person2)) {
            Node node1 = new Node(person1, relationship, person2);
            Node node2 = new Node(person2, relationship.getOppositeRelationship(), person1);
            tree.add(node1);
            tree.add(node2);
        }
    }

    @Override
    public boolean hasRelationship(Person p1, Person p2) {
        for (Relationship relationship : Relationship.values()) {
            for (Node node : tree) {
                if (node.p1.equals(p1) && node.p2.equals(p2) && node.re == relationship && p1 != p2) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public ArrayList<Node> getTree() {
        return tree;
    }
}

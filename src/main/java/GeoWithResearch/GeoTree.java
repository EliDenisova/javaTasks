package GeoWithResearch;

import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void appendParen(Person parent, Person children) {
        if (parent != null && children != null) {
            tree.add(new Node(parent, Relationship.parent, children));
            tree.add(new Node(children, Relationship.children, parent));
        }
    }
    public void appendGrandparent(Person grandparent, Person grandsons) {
        if (grandparent != null && grandsons != null) {
            tree.add(new Node(grandparent, Relationship.grandparent, grandsons));
            tree.add(new Node(grandsons, Relationship.grandsons, grandparent));
        }
    }
    public void appendAunt(Person aunt, Person nephews) {
        if (aunt != null && nephews != null) {
            tree.add(new Node(aunt, Relationship.aunt, nephews));
            tree.add(new Node(nephews, Relationship.nephews, aunt));
        }
    }

}

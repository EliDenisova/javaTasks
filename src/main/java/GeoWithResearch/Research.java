package GeoWithResearch;

import java.util.ArrayList;
import java.util.Objects;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Research(GeoTreeInterface geoTreeInterface) {
        tree = geoTreeInterface.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        if (tree != null) {
            for (Node t : tree) {
                if (Objects.equals(t.p1.fullName, p.fullName) && t.re == re) {
                    result.add(t.p2.fullName);
                }
            }
        }
        return result;
    }

    public ArrayList<String> findRelationships(Person p, Relationship re) {
        ArrayList<String> result = new ArrayList<>();
        for (Node node : tree) {
            if (node.p1.equals(p) && node.re == re) {
                result.add(node.p2.getFullName());
            }
        }
        return result;
    }

    public ArrayList<String> allRelationships(Person p) {
        ArrayList<String> result = new ArrayList<>();
        result.add("Все отношения " + p.getFullName());
        for (Node t : tree) {
            if (t.p1.getFullName().equals(p.getFullName())) {
                result.add(t.re + ": " + t.p2.getFullName());
            }
        }
        return result;
    }

}

package GeoWithResearch2;

import java.util.ArrayList;
import java.util.Objects;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
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

}

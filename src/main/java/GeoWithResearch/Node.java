package GeoWithResearch;

public class Node {

    public Node(Person p1, Relationship re, Person p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    Person p1;
    Relationship re;
    Person p2;

    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1, re, p2);
    }

//    @Override
//    public int hashCode() {
//        int result = 15;
//
//        result = 31 * result + (p1 == null? 0 : p1.hashCode());
//        result = 31 * result + (p2 == null? 0 : p2.hashCode());
//        result = 31 * result + (re == null? 0 : re.hashCode());
//
//        return result;
//    }
}

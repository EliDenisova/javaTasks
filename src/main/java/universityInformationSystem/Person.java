package universityInformationSystem;

import java.util.List;

public abstract class Person {
    private String name;
    private String phoneNumber;
    private String city;
    List<String> subjects;

    public Person(String name, List<String> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

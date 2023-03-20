package universityInformationSystem;

import java.util.List;

public abstract class Person {
    private String name;
    Specialization specialization;

    public Person(String name, Specialization specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

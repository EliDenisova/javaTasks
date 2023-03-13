package GeoWithResearch;

import java.util.Objects;

public class Person {
    public String fullName;
    public int age;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public int hashCode() {
        int result = 15;

        result = 31 * result + (fullName == null ? 0 : fullName.hashCode());
        result = 31 * result + age;

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age && fullName.equals(person.fullName);
    }
}

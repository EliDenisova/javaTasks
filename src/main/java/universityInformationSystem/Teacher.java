package universityInformationSystem;

import java.util.List;

public class Teacher extends Person{
    List<Student> students;

    public Teacher(String name, List<String> subjects) {
        super(name, subjects);
    }

    public Teacher(String name, List<String> subjects, List<Student> students) {
        super(name, subjects);
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}

package universityInformationSystem;

import java.util.List;

public class Student extends Person {
    private int courseOfStudy;

    public Student(String name, List<String> subjects, int courseOfStudy) {
        super(name, subjects);
        this.courseOfStudy = courseOfStudy;
    }

    public Student(String name, int courseOfStudy, List<String> subjects) {
        super(name, subjects);
        this.courseOfStudy = courseOfStudy;
    }

    public int getCourseOfStudy() {
        return courseOfStudy;
    }

    public void setCourseOfStudy(int courseOfStudy) {
        this.courseOfStudy = courseOfStudy;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}

package universityInformationSystem;

import java.util.List;

public interface TeacherStorage<T extends Teacher>{

    void add(T teacher);
    T getByName(String name);
    T getTeacherBySubject(String subject);
    List<Student> getStudentByTeacher(String teacherName);

}

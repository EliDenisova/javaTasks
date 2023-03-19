package universityInformationSystem;

import java.util.ArrayList;
import java.util.List;

public class StoringTeacherInMemory implements TeacherStorage {
    List<Teacher> teachers = new ArrayList<>();

    @Override
    public void add(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public Teacher getByName(String name) {
        for (Teacher teacher : teachers) {
            if (teacher.getName().equals(name)) {
                return teacher;
            }
        }
        return null;
    }

    @Override
    public Teacher getTeacherBySubject(String subject) {
        for (Teacher teacher : teachers) {
            for (String subject1 : teacher.getSubjects()) {
                if (subject1.equals(subject)) {
                    return teacher;
                }
            }
        }
        return null;
    }

    @Override
    public List<Student> getStudentByTeacher(String teacherName) {
        for (Teacher teacher : teachers) {
            if (teacher.getName().equals(teacherName)){
                return teacher.getStudents();
            }
        }
        return null;
    }

}

package universityInformationSystem;

import java.util.List;

public class InformationSystem <T extends Person>{
    private TeacherStorage teacherStorage;
    private  StudentStorage studentStorage;
    private Importer importer;
    private ExporterPerson exporter;

    public InformationSystem(TeacherStorage teacherStorage, Importer importer, ExporterPerson exporter) {
        this.teacherStorage = teacherStorage;
        this.importer = importer;
        this.exporter = exporter;
    }

    public InformationSystem(StudentStorage studentStorage, Importer importer, ExporterPerson exporter) {
        this.studentStorage = studentStorage;
        this.importer = importer;
        this.exporter = exporter;
    }

    List<Teacher> importerTeacher(String filePath){
        return importer.importerTeacher(filePath);
    }
    List<Student> importerStudent(String filePath) {
        return importer.importerStudent(filePath);
    }

    public void exportTeacher(String filePath) {
        List<Teacher> teachers = teacherStorage.getAllTeacher();
        exporter.exporterTeacher(teachers ,filePath);
    }

    public void exportStudent(String filePath) {
        List<Student> students = studentStorage.getAllStudent();
        exporter.exporterStudent(students, filePath);
    }

    public void addTeacher(String name, Specialization specialization, List<String> student) {
        Teacher teacher = new Teacher(name, specialization, student);
    }

    public void addStudent(String name, Specialization specialization, int courseOfStudy) {
        Student student = new Student(name, specialization, courseOfStudy);
    }
}

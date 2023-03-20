package universityInformationSystem;

import java.util.List;

public interface Importer {
    List<Teacher> importerTeacher(String filePath);
    List<Student> importerStudent(String filePath);

}

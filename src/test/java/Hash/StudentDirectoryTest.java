package Hash;

import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;

public class StudentDirectoryTest {
    private StudentDirectory dir;

    @BeforeEach
    void setUp() {
        dir = new StudentDirectory();
    }

    public void testStoreAndRetrieve() throws IOException {
        final int numberOfStudents = 10;

        for (int i = 0; i < numberOfStudents; i++) {
            addStudent(dir, i);

        }
    }

    private void addStudent(StudentDirectory dir, int i) {
        String id = ""+i;
        Student student = new Student(id);
        student.setId(id);
        student.addCredits(i);
        dir.add(student);
    }
}

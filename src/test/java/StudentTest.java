import org.junit.jupiter.api.Test;

import lab11.builder.Student;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testStudentBuilder() {
        Student student = Student.builder()
                .firstName("Ivan")
                .lastName("Shynkarenko")
                .gender("Male")
                .email("shynkarenko@example.com")
                .age(18)
                .course("Mathematics")
                .course("English")
                .build();

        assertEquals("Ivan", student.getFirstName());
        assertEquals("Shynkarenko", student.getLastName());
        assertEquals("Male", student.getGender());
        assertEquals("shynkarenko@example.com", student.getEmail());
        assertEquals(18, student.getAge());
        assertEquals(List.of("Mathematics", "English"), student.getCourses());
    }

    @Test
    void testEqualsAndHashCode() {
        Student student1 = Student.builder()
                .firstName("Ivan")
                .lastName("Shynkarenko")
                .gender("Male")
                .email("shynkarenko@example.com")
                .age(18)
                .course("Mathematics")
                .course("English")
                .build();

        Student student2 = Student.builder()
                .firstName("Ivan")
                .lastName("Shynkarenko")
                .gender("Male")
                .email("shynkarenko@example.com")
                .age(18)
                .course("Mathematics")
                .course("English")
                .build();

        assertEquals(student1, student2);
        assertEquals(student1.hashCode(), student2.hashCode());
    }

    @Test
    void testToString() {
        Student student = Student.builder()
                .firstName("Ivan")
                .lastName("Shynkarenko")
                .gender("Male")
                .email("shynkarenko@example.com")
                .age(18)
                .course("Mathematics")
                .course("English")
                .build();

        String toStringOutput = student.toString();
        assertTrue(toStringOutput.contains("Ivan"));
        assertTrue(toStringOutput.contains("Shynkarenko"));
        assertTrue(toStringOutput.contains("Male"));
        assertTrue(toStringOutput.contains("shynkarenkoh@example.com"));
        assertTrue(toStringOutput.contains("18"));
        assertTrue(toStringOutput.contains("Mathematics"));
        assertTrue(toStringOutput.contains("English"));
    }
}


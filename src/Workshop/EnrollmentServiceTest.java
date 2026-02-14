package Workshop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnrollmentServiceTest {

    private EnrollmentService enrollmentService;

    @BeforeEach
    void setUp() {
        enrollmentService = new EnrollmentService();
    }

    @Test
    void shouldEnrollStudentSuccessfully() {
        boolean result = enrollmentService.enrollStudent("john_doe", "Java Programming");

        assertTrue(result);
    }

    @Test
    void shouldReturnFalseIfStudentAlreadyEnrolled() {
        enrollmentService.enrollStudent("john_doe", "Java Programming");

        boolean result = enrollmentService.enrollStudent("john_doe", "Java Programming");

        assertFalse(result);
    }
}


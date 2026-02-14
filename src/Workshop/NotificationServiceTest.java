package Workshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificationServiceTest {

    @Test
    void shouldReturnTrueForValidEmail() {
        NotificationService service = new NotificationService();

        boolean result = service.sendEmail("user@example.com", "Hello!");

        assertTrue(result);
    }

    @Test
    void shouldReturnFalseForInvalidEmail() {
        NotificationService service = new NotificationService();

        boolean result = service.sendEmail("invalid-email", "Hello!");

        assertFalse(result);
    }
}


package Workshop;

public class NotificationService {

    public boolean sendEmail(String email, String message) {
        if (email == null || !isValidEmail(email)) {
            return false;
        }

        // Simulate email sending logic
        // (In real systems, SMTP or third-party services are used)
        return true;
    }

    // Basic email validation
    private boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }
}


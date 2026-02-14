package Workshop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EnrollmentService {

    // Stores enrolled courses for each student
    private Map<String, Set<String>> enrollments = new HashMap<>();

    public boolean enrollStudent(String studentUsername, String courseName) {
        // Get existing courses or create new set
        Set<String> courses = enrollments.getOrDefault(studentUsername, new HashSet<>());

        // If already enrolled, return false
        if (courses.contains(courseName)) {
            return false;
        }

        // Enroll student
        courses.add(courseName);
        enrollments.put(studentUsername, courses);
        return true;
    }
}


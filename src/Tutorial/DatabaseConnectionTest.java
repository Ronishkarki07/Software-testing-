package Tutorial;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseConnectionTest {

    boolean isConnected;

    void connectToDatabase() {
        isConnected = true;
        System.out.println("Connected to database");
    }

    void closeConnection() {
        isConnected = false;
        System.out.println("Disconnected database");
    }

    @Test
    void performOperations() {
        assertTrue(isConnected);
    }

    @BeforeEach
    void setup(){
        connectToDatabase();
    }

    @AfterEach
    void terminate(){
        closeConnection();
    }
}

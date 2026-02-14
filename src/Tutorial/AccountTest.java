package Tutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    void testDepositAndWithdraw() {
        // Arrange
        Account account = new Account(1000.0);

        // Act
        account.deposit(500.0);    // deposit money
        account.withdraw(300.0);   // withdraw money

        // Assert
        assertEquals(1200.0, account.getBalance(), 0.01);
    }
}


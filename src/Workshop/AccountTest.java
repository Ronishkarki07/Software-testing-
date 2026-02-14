package Workshop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount();
    }

    @Test
    void depositShouldIncreaseBalance() {
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.001);
    }

    @Test
    void withdrawShouldDecreaseBalance() {
        account.deposit(100.0);
        account.withdraw(50.0);
        assertEquals(50.0, account.getBalance(), 0.001);
    }

    @Test
    void withdrawMoreThanBalanceShouldFail() {
        account.deposit(100.0);
        account.withdraw(50.0);

        boolean result = account.withdraw(60.0);

        assertFalse(result);
        assertEquals(50.0, account.getBalance(), 0.001);
    }
}


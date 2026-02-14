package Workshop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeCheckerTest {

    @Test
    void shouldReturnTrueForPrimeNumber() {
        assertTrue(PrimeChecker.isPrime(7));
    }

    @Test
    void shouldReturnFalseForNonPrimeNumber() {
        assertFalse(PrimeChecker.isPrime(9));
    }

    @Test
    void shouldReturnFalseForNumbersLessThanTwo() {
        assertFalse(PrimeChecker.isPrime(1));
        assertFalse(PrimeChecker.isPrime(0));
        assertFalse(PrimeChecker.isPrime(-5));
    }
}



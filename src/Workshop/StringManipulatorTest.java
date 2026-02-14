package Workshop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void testAllStringManipulatorMethods() {
        StringManipulator sm = new StringManipulator();
        String input = "madam";

        assertAll("StringManipulator tests",
                () -> assertEquals("madam", sm.reverse(input), "Reverse should work correctly"),
                () -> assertEquals("MADAM", sm.toUpperCase(input), "Uppercase conversion should work"),
                () -> assertTrue(sm.isPalindrome(input), "Should detect palindrome"),
                () -> assertEquals(2, sm.countVowels(input), "Should count vowels correctly")
        );
    }
}

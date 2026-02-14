package Tutorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class mathUtilsTest {
    @Test
    public void testAdd(){
        Calculator calc = new Calculator();
        int result = calc.addTwoNumbers(1, 2);
        assertEquals(3, result, " 5 and 6 should be 11");
    }
}

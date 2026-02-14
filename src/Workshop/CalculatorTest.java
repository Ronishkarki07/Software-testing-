package Workshop;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    static void beforeAllTests() {
        System.out.println("Starting Calculator Test Suite");
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Calculator initialized");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test completed");
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("All Calculator tests finished");
    }

    @Test
    void testAddition() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(6, calculator.subtract(10, 4));
    }

    @Test
    void testMultiplication() {
        assertEquals(20, calculator.multiply(4, 5));
    }

    @Test
    void testDivision() {
        assertEquals(5, calculator.divide(10, 2));
    }
}


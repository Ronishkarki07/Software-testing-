package Workshop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testArea() {
        Rectangle rectangle = new Rectangle(4, 4);
        assertEquals(16, rectangle.area(), 0.001);
    }

    @Test
    void testPerimeter() {
        Rectangle rectangle = new Rectangle(5, 4);
        assertEquals(18, rectangle.perimeter(), 0.001);
    }
}

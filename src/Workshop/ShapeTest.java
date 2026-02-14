package Workshop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void testCircleArea() {
        Shape circle = new Circle(5);
        assertEquals(Math.PI * 25, circle.area(), 0.001);
    }

    @Test
    void testRectangleArea() {
        Shape rectangle = new Rectangles(4, 6);
        assertEquals(24, rectangle.area(), 0.001);
    }

    @Test
    void testBaseShapeArea() {
        Shape shape = new Shape();
        assertEquals(0, shape.area(), 0.001);
    }
}


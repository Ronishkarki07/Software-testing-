package Tutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    void testPriceWithDiscount() {
        Product product = new Product("Laptop", 1000.0, 10.0);
        double totalPrice = product.calculateTotalPrice();
        assertEquals(900.0, totalPrice, "Price should equal 900");
    }

    @Test
    void testPriceWithNoDiscount() {
        Product product = new Product("Mouse", 500.0, 0.0);
        double totalPrice = product.calculateTotalPrice();
        assertEquals(500.0, totalPrice, 0.01);
    }

    @Test
    void testPriceWithFullDiscount() {
        Product product = new Product("Promo Item", 200.0, 100.0);
        double totalPrice = product.calculateTotalPrice();
        assertEquals(0.0, totalPrice, 0.01);
    }
}


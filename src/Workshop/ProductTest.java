package Workshop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void productAssertionsUsingAssertAll() {
        Product product = new Product("Laptop", 500.0, 2);

        assertAll("Product validation",
                () -> assertNotNull(product.getName(), "Name should not be null"),
                () -> assertTrue(product.getPrice() > 0, "Price should be positive"),
                () -> assertTrue(product.isAffordable(1000.0), "Should be affordable within budget"),
                () -> assertFalse(product.isAffordable(900.0), "Should not be affordable with lower budget")
        );
    }
}


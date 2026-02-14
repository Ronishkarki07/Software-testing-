package Workshop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    private Inventory inventory;

    @BeforeEach
    void setUp() {
        inventory = new Inventory();
        inventory.addProduct("Keyboard", 10);
    }

    @Test
    void shouldReturnTrueWhenSufficientStockIsAvailable() {
        assertTrue(inventory.isProductAvailable("Keyboard", 5));
    }

    @Test
    void shouldReturnFalseWhenRequestedQuantityExceedsStock() {
        assertFalse(inventory.isProductAvailable("Keyboard", 15));
    }

    @Test
    void shouldReturnFalseWhenProductDoesNotExist() {
        assertFalse(inventory.isProductAvailable("Mouse", 1));
    }
}



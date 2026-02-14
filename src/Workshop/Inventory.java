package Workshop;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private Map<String, Integer> stock = new HashMap<>();

    // Add or update product stock
    public void addProduct(String productName, int quantity) {
        stock.put(productName, quantity);
    }

    // Check product availability
    public boolean isProductAvailable(String productName, int quantity) {
        if (!stock.containsKey(productName)) {
            return false;
        }
        return stock.get(productName) >= quantity;
    }
}


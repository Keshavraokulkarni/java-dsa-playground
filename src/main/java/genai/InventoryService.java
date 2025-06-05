package genai;

import java.util.HashMap;
import java.util.Map;

public class InventoryService {
    private static Map<String, Double> priceDatabase = new HashMap<>();

    public static void updatePrice(String itemId, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        priceDatabase.put(itemId, price);
    }

    public static double getPrice(String itemId) {
        return priceDatabase.getOrDefault(itemId, -1.0);
    }
}


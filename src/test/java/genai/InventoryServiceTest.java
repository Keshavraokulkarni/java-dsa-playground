package genai;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class InventoryServiceTest {

    @BeforeEach
    void reset() {
        // Clear static map for test isolation
        try {
            var field = InventoryService.class.getDeclaredField("priceDatabase");
            field.setAccessible(true);
            ((java.util.Map<?, ?>) field.get(null)).clear();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.01, 1.0, 100.0, 9999999.99, Double.MAX_VALUE})
    void testValidPriceUpdateAndRetrieval(double price) {
        String itemId = "itemA";
        InventoryService.updatePrice(itemId, price);
        assertEquals(price, InventoryService.getPrice(itemId));
    }

    @Test
    void testMultipleUpdatesOnSameItem() {
        String itemId = "itemB";
        InventoryService.updatePrice(itemId, 10.0);
        assertEquals(10.0, InventoryService.getPrice(itemId));
        InventoryService.updatePrice(itemId, 20.0);
        assertEquals(20.0, InventoryService.getPrice(itemId));
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1.0, -100.0, -0.01})
    void testNegativePriceThrowsException(double price) {
        String itemId = "itemC";
        assertThrows(IllegalArgumentException.class, () -> InventoryService.updatePrice(itemId, price));
    }

    @Test
    void testZeroPriceIsAllowed() {
        String itemId = "itemD";
        InventoryService.updatePrice(itemId, 0.0);
        assertEquals(0.0, InventoryService.getPrice(itemId));
    }

    @Test
    void testMissingItemReturnsMinusOne() {
        assertEquals(-1.0, InventoryService.getPrice("nonexistent"));
    }

    @Test
    void testLargeNumberOfUpdatesPerformance() {
        int n = 100_000;
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            InventoryService.updatePrice("item" + i, i * 1.0);
        }
        long duration = System.currentTimeMillis() - start;
        assertTrue(duration < 2000, "Performance: Should update 100k items in under 2 seconds");
        assertEquals(99999.0, InventoryService.getPrice("item99999"));
    }
}

/*
// Write a JUnit test class to validate the InventoryService functionality:
// 1. Test valid price updates.
// 2. Test updating price multiple times.
// 3. Test invalid price values (negative, zero, large numbers).
// 4. Test retrieval of missing item prices.
// 5. Ensure that the price is correctly retrieved after updates.
// 6. Ensure that the price is not updated when an invalid value is provided.
// 7. Ensure that the price is correctly updated when a valid value is provided.
// 8. Ensure that the price is not updated when a negative value is provided.
// 9. Ensure that the price is not updated when a zero value is provided.
// 10. Ensure that the price is correctly updated when a large value is provided.
// 11. Ensure that the price is correctly retrieved after multiple updates.
// 12. Ensure that the price is correctly retrieved after a single update.
// 13. Ensure that the price is not retrieved for a non-existent item.
// 14. Ensure that the price is not retrieved for an item that has never been updated.
// 15. Ensure that the price is not retrieved for an item that has been removed.
// 16. Ensure that the price is not retrieved for an item that has been updated to a negative value.
// 17. Ensure that the price is not retrieved for an item that has been updated to zero.
// 18. Ensure that the price is not retrieved for an item that has been updated to a large value.
// 19. Ensure that the price is not retrieved for an item that has been updated multiple times.
// 20. Ensure that the price is not retrieved for an item that has been updated to a negative value multiple times.
// 21. Ensure that the price is not retrieved for an item that has been updated to zero multiple times.
 */
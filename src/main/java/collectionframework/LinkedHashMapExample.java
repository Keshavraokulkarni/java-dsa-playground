package collectionframework;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> dayNumberMapping = new LinkedHashMap<>();

// Adding new key-value pairs to the LinkedHashMap
        dayNumberMapping.put("Mon", 1);
        dayNumberMapping.put("Tus", 2);
        dayNumberMapping.put("Wen", 3);
        dayNumberMapping.put("Thu", 4);
        dayNumberMapping.put("Fri", 5);
        dayNumberMapping.put("Sat", 6);
        dayNumberMapping.put("Sat", 6);

// Add a new key-value pair only if the key does not exist
// in the LinkedHashMap, or is mapped to `null`
        dayNumberMapping.putIfAbsent("Sun", 7);

        System.out.println(dayNumberMapping);
    }
}

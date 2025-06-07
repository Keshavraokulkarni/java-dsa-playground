package collectionframework;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<String, String> fileExtensions  = new TreeMap<>();

// Adding new key-value pairs to a TreeMap
        fileExtensions.put("python", ".py");
        fileExtensions.put("c++", ".cpp");
        fileExtensions.put("kotlin", ".kt");
        fileExtensions.put("golang", ".go");
        fileExtensions.put("java", ".java");

// Printing the TreeMap (Output will be sorted based on keys)
        System.out.println(fileExtensions);
    }
}

package STRING;

import java.util.*;

public class Top10FrequentWords {
    public static void main(String[] args) {
        String input = "This is a sample string with sample words and sample text, " +
                "and this string is just a sample to test the top ten frequent words." +
                "frequent, frequent, frequent, frequent, frequent, frequent, frequent, frequent, frequent, frequent";
        printTop10FrequentWords(input);
    }

    public static void printTop10FrequentWords(String text) {
        // Normalize the text: convert to lower case and remove punctuation
        String normalized = text.toLowerCase().replaceAll("[^a-z\\s]", " ");
        String[] words = normalized.split("\\s+");

        // Count frequency of each word
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            if(word.isEmpty()) continue;
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        // Use a min-heap (priority queue) to keep the top 10 frequent words
        PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getValue)
        );

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > 10) {
                minHeap.poll();
            }
        }

        // Retrieve entries from the heap; they will be in ascending order
        List<Map.Entry<String, Integer>> topWords = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            topWords.add(minHeap.poll());
        }
        // Reverse to print in descending order of frequency
        Collections.reverse(topWords);

        System.out.println("Top 10 frequent words:");
        for (Map.Entry<String, Integer> entry : topWords) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


}

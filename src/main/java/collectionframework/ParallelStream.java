package collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Spliterator;


public class ParallelStream {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Hi");
        collection.add("Hello");
        collection.parallelStream().forEach(System.out::println);

        Collection<Integer> splitCollectionList= new ArrayList<>();
        for(int i=0;i<10000;i++) {
            splitCollectionList.add(i);

        }

        Spliterator<Integer> spliterator = splitCollectionList.spliterator();
        spliterator.forEachRemaining(System.out::println);
    }
}

package collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {

        Collection<String> fruitCollection = new ArrayList<>();
        boolean isEmpty = fruitCollection.isEmpty();
        System.out.println("isEmpty:"+isEmpty);
        fruitCollection.add("banana");
        fruitCollection.add("apple");
        boolean isAdded = fruitCollection.add("mango");
        System.out.println("isEmpty Check:"+fruitCollection.isEmpty());
        System.out.println(fruitCollection);
        System.out.println("isAdded:"+isAdded);

        Iterator<String> iterator = fruitCollection.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        fruitCollection.remove("banana");
        System.out.println(fruitCollection);

        System.out.println(fruitCollection.contains("apple"));

        fruitCollection.forEach((element) -> {
            System.out.println(element);
        });

        fruitCollection.clear();
        System.out.println("Size:"+fruitCollection.size());

        System.out.println(fruitCollection);
    }
}

package collectionframework;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {
    enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    }

    public static void main(final String[] args) {
        final EnumMap<Days, String> enumMap = new EnumMap<>(Days.class);
        enumMap.put(Days.SUNDAY, "Its Sunday!!");
        enumMap.put(Days.MONDAY, "Its Monday!!");
        enumMap.put(Days.TUESDAY, "Its Tuesday!!");
        enumMap.put(Days.WEDNESDAY, "Its Wednesday!!");
        enumMap.put(Days.THURSDAY, "Its Thursday!!");
        enumMap.put(Days.FRIDAY, "Its Friday!!");
        enumMap.put(Days.SATURDAY, "Its Saturday!!");

        for(final Map.Entry<Days, String> entry : enumMap.entrySet()){
            System.out.println(" Key -> " + entry.getKey().SUNDAY);
            System.out.println("Value - >" + entry.getValue());
        }
    }
}

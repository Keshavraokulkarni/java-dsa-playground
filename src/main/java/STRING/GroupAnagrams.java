package STRING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();

        for(String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);

            if(!map.containsKey(sortedStr)) {
                map.put(sortedStr,new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
      //  String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        //System.out.println(groupAnagrams(strings));

        Boolean a = null;
        Boolean b = true;
        Boolean c = false;

        System.out.println("a:"+Boolean.TRUE.equals(a));
        System.out.println("b:"+Boolean.TRUE.equals(b));
        System.out.println("c:"+Boolean.TRUE.equals(c));

    }
}

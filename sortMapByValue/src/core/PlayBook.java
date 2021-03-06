package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PlayBook
{
    public static void main(String []args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("python", 13);
        map.put("java", 57);
        map.put("Os", 78);
        map.put("Unix", 34);
        map.put("Ruby", 23);
        map.put("Linux", 98);
        Set<Entry<String, Integer>> set = map.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " +++ " + entry.getValue());
        }
    }
}

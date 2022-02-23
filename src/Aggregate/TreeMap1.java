package Aggregate;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<people,String> treemap = new TreeMap<>();
        people p1 = new people("张三",20);
        people p2 = new people("李四",19);
        people p3 = new people("王五",21);
        treemap.put(p1,"北京");
        treemap.put(p2,"南京");
        treemap.put(p3,"西京");
        System.out.println(treemap.toString());

//        treemap.remove(p1);
//        System.out.println(treemap.toString());

//        for (people p : treemap.keySet()) {
//            System.out.println(p+" "+treemap.get(p));
//        }

        for (Map.Entry<people, String> peopleStringEntry : treemap.entrySet()) {
            System.out.println(peopleStringEntry.getKey() + "---" + peopleStringEntry.getValue());
        }

        System.out.println(treemap.containsKey(p1));
        System.out.println(treemap.containsValue("南京"));
        System.out.println(treemap.isEmpty());
    }
}

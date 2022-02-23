package Aggregate;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String[] args) {
        HashMap<people,String> map = new HashMap<>();
        people p1 = new people("张三",20);
        people p2 = new people("李四",19);
        people p3 = new people("王五",21);
        map.put(p1,"北京");
        map.put(p2,"南京");
        map.put(p3,"东京");
        map.put(new people("张三",20),"西京");//与hashset原理相同
        System.out.println(map.size());
        System.out.println(map.toString());

//        map.remove(p1);
//        System.out.println(map.toString());

//        for (people people : map.keySet()) {
//            System.out.println(map.get(people));
//        }
        for (Map.Entry<people, String> peopleStringEntry : map.entrySet()) {
            System.out.println(peopleStringEntry.getKey() + "====" + peopleStringEntry.getValue());
        }

        System.out.println(map.containsKey(p1));
        System.out.println(map.containsValue("南京"));
        System.out.println(map.isEmpty());
    }
}

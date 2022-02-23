package Aggregate;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        //添加元素
        map.put("cn","中国");
        map.put("uk","英国");
        map.put("usa","美国");
        System.out.println(map.size());
        System.out.println(map.toString());

//        map.remove("uk");
//        System.out.println(map.size());
        //使用keyset

//        Set<String>keyset = map.keySet();
//        for (String key:keyset
//             ) {
//            System.out.println(key);
//            System.out.println(map.get(key));
//        }

        //使用entryset
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry:entries
             ) {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }

        System.out.println(map.containsKey("uk"));
        System.out.println(map.isEmpty());
    }
}

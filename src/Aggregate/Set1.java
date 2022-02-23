package Aggregate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 测试set接口的使用
 */

public class Set1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("xxx");
        set.add("yyy");
        set.add("zzz");
        System.out.println(set.toString());

//        set.remove("xxx");
//        System.out.println(set.toString());

//        for (String s:set
//             ) {
//            System.out.println(s);
//        }

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println(set.contains("xxx"));
        System.out.println(set.isEmpty());
    }
}

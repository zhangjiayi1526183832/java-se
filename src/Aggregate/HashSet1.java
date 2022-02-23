package Aggregate;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> hashset= new HashSet<String>();
        hashset.add("xxx");
        hashset.add("yyy");
        hashset.add("zzz");
        System.out.println(hashset.toString());

//        hashset.remove("xxx");
//        System.out.println(hashset);

//        for (String s:hashset
//             ) {
//            System.out.println(s);
//        }
        Iterator<String> iterator = hashset.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println(hashset.contains("xxx"));
        System.out.println(hashset.isEmpty());
    }
}

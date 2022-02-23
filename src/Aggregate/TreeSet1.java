package Aggregate;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<String> treeset = new TreeSet<String>();
        treeset.add("xxx");
        treeset.add("yyy");
        treeset.add("zzz");
        System.out.println(treeset.size());
        System.out.println(treeset.toString());

//        treeset.remove("xxx");
//        System.out.println(treeset.toString());

//        for (String s:treeset
//             ) {
//            System.out.println(s);
//        }
        Iterator<String> iterator = treeset.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println(treeset.contains("xxx"));
        System.out.println(treeset.isEmpty());
    }
}

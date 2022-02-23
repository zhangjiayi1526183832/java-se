package Aggregate;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet<people> treeset = new TreeSet<people>();
        people p1 = new people("张三",20);
        people p2 = new people("李四",19);
        people p3 = new people("王五",21);
        treeset.add(p1);
        treeset.add(p2);
        treeset.add(p3);
        System.out.println(treeset.toString());

//        treeset.remove(p1);
//        System.out.println(treeset.toString());

//        for (people p:treeset
//             ) {
//            System.out.println(p);
//        }
//
        Iterator<people> iterator = treeset.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println(treeset.contains(p1));
        System.out.println(treeset.isEmpty());
    }
}

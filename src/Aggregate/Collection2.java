package Aggregate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection2 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        people p1 = new people("张三",20);
        people p2 = new people("李四",19);
        people p3 = new people("王五",21);
        collection.add(p1);
        collection.add(p2);
        collection.add(p3);
        System.out.println("元素个数：" + collection.size());
        System.out.println(collection.toString());

//        collection.remove(p1);
//        System.out.println("元素个数：" + collection.size());
//        System.out.println(collection.toString());
//
//        collection.clear();
//        System.out.println("元素个数：" + collection.size());
//        for (Object obj:collection
//             ) {
//                people p =(people)obj;
//            System.out.println(p);
//        }
        Iterator it = collection.iterator();
        while (it.hasNext())
        {
            people p =(people)it.next();
            System.out.println(p.toString());
        }
    }
}

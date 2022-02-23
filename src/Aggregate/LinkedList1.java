package Aggregate;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        people p1 = new people("张三",20);
        people p2 = new people("李四",30);
        people p3 = new people("王五",40);
        ll.add(p1);
        ll.add(p2);
        ll.add(p3);
        ll.add(p3);
        System.out.println(ll.size());

//        ll.remove(0);
//        ll.remove(p1);
//        ll.clear();

//        for (Object o:
//             ll) {
//            people p = (people)o;
//            System.out.println(o.toString());
//        }

//        Iterator it =ll.iterator();
//        while(it.hasNext())
//        {
//            people p = (people)it.next();
//            System.out.println(p.toString());
//        }

        ListIterator lit = ll.listIterator();
        while (lit.hasNext())
        {
            people p = (people)lit.next();
            System.out.println(p.toString());
        }
        while (lit.hasPrevious())
        {
            people p = (people)lit.previous();
            System.out.println(p.toString());
        }

        System.out.println(ll.contains(p1));
        System.out.println(ll.isEmpty());

        System.out.println(ll.indexOf(p1));
    }
}

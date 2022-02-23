package Aggregate;

import java.util.ArrayList;
import java.util.Iterator;

public class Genericcollection1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("xxx");
        arrayList.add("yyy");
        for (String s:arrayList
             ) {
            System.out.println(s);
        }

        ArrayList<people> arrayList1 = new ArrayList<people>();
        people p1 = new people("张三",20);
        people p2 = new people("李四",19);
        people p3 = new people("王五",21);
        arrayList1.add(p1);
        arrayList1.add(p2);
        arrayList1.add(p3);
        Iterator<people> iterator = arrayList1.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        
    }
}

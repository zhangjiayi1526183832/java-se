package Aggregate;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
    public static void main(String[] args) {
        HashSet<people> hashset = new HashSet<people>();
        people p1 = new people("张三",20);
        people p2 = new people("李四",19);
        people p3 = new people("王五",21);
        hashset.add(p1);
        hashset.add(p2);
        hashset.add(p3);
        hashset.add(new people("王五",21));//要想在此时不想让新生成的对象加入，需要重写类的hashcode方法和equals方法
        System.out.println(hashset.toString());

//        hashset.remove(p1);
//        System.out.println(hashset.toString());
//        hashset.remove(new people("王五",21));//如果没有重写两个上述方法，此时删除不掉该对象的对应信息,删除和加入的步骤是一样的
//        for (people p:hashset
//             ) {
//            System.out.println(p);
//        }
        Iterator<people> iterator = hashset.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println(hashset.contains(p1));
        System.out.println(hashset.isEmpty());
    }
}

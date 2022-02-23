package Aggregate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        people p1 = new people("张三",20);
        people p2 = new people("李四",30);
        people p3 = new people("王五",40);
        al.add(p1);
        al.add(p2);
        al.add(p3);
        al.add(p3);
        System.out.println("元素个数" + al.size());
        System.out.println(al.toString());

//        al.remove(p1);
//        System.out.println("元素个数" + al.size());
        al.remove(new people("张三",20));//使用此种删除方法时要重写类的equals方法
        System.out.println("元素个数" + al.size());
        System.out.println(al.toString());
//常规迭代器
//        Iterator it = al.iterator();
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }
//列表迭代器
        ListIterator lit = al.listIterator();
        while (lit.hasNext())
        {
            people p =(people)lit.next();
            System.out.println(p.toString());
        }
        while (lit.hasPrevious())
        {
            people p =(people)lit.previous();
            System.out.println(p.toString());
        }
//查找
        System.out.println(al.indexOf(p2));
    }
}

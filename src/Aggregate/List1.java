package Aggregate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List1 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("苹果");
        list.add("小米");
        list.add("华为");
        list.add("oppo");
        System.out.println("元素个数" + list.size());
        System.out.println(list.toString());
        //删除元素
//        list.remove("苹果");
//        list.remove(0);
//        System.out.println("元素个数" + list.size());
//        System.out.println(list.toString());
        //遍历
        //for循环
//        for(int i=0; i<list.size();i++)
//        {
//            System.out.println(list.get(i));
//        }
        //增强for
//        for (Object obj:list
//             ) {
//            System.out.println(obj);
//        }
        //迭代器
//        Iterator it = list.iterator();
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }
        //列表迭代器
        ListIterator lit = list.listIterator();
        System.out.println("正向打印");
        while(lit.hasNext())
        {
            System.out.println(lit.next());
        }

        System.out.println("反向打印");
        while(lit.hasPrevious())
        {
            System.out.println(lit.previous());
        }
        //返回下标
        System.out.println(list.indexOf("华为"));
    }
}

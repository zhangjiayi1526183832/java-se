package Aggregate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection1 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        //添加对象
        collection.add("苹果");
        collection.add("香蕉");
        collection.add("榴莲");
        System.out.println("元素个数：" + collection.size());
        System.out.println(collection);
        //删除对象
//        collection.remove("榴莲");
//        System.out.println("删除后元素个数：" + collection.size());
//        System.out.println(collection);
        //遍历对象
        //1.增强for
//        for (Object object:collection ) {
//            System.out.println(object);
//        }
        //2.使用迭代器(专门用来遍历集合)
        Iterator it = collection.iterator();
        while(it.hasNext())
        {
            String s =(String)it.next();
            System.out.println(s);
//            it.remove();
        }
        System.out.println("迭代后元素个数：" + collection.size());
        System.out.println(collection.contains("苹果"));
        System.out.println(collection.isEmpty());
    }
}

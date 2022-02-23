package Aggregate;

import java.util.ArrayList;
import java.util.List;

public class List2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        //保存基本数据类型时包含自动装箱
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println("元素个数" + list.size());
        System.out.println(list.toString());
//        list.remove((Object) 20);
        System.out.println(list.toString());
        List listchild = list.subList(1,3);
        System.out.println(listchild.toString());
    }
}

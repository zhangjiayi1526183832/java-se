package Aggregate;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparator1 {
    public static void main(String[] args) {
        //创建集合
        TreeSet<people> treeset = new TreeSet<people>(new Comparator<people>() {
            @Override
            public int compare(people o1, people o2) {
                int n1 = o1.getAge()-o2.getAge();
                int n2 = o1.getName().compareTo(o2.getName());
                return n1==0?n1:n1;
            }
        });
        people p1 = new people("张三",20);
        people p2 = new people("李四",22);
        people p3 = new people("王五",21);
        treeset.add(p1);
        treeset.add(p2);
        treeset.add(p3);
        System.out.println(treeset.toString());
    }
}

package Aggregate;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet3 {
    public static void main(String[] args) {
        TreeSet<String> treeset = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int n1 = o1.length()-o2.length();
                int n2 = o1.compareTo(o2);
                return n1==0?n2:n1;

            }
        });
        treeset.add("helloworld");
        treeset.add("zhang");
        treeset.add("lisi");
        treeset.add("wangwu");
        treeset.add("beijing");
        treeset.add("xian");
        treeset.add("nanjing");
        System.out.println(treeset.toString());
    }
}

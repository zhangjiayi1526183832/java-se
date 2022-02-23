package Aggregate;

import sun.misc.PostVMInitHook;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("芒果");
        vector.add("草莓");
        vector.add("苹果");

//        vector.clear();
//        vector.remove("芒果");
//        vector.remove(0);

        //使用枚举器进行遍历
        Enumeration e = vector.elements();
        while(e.hasMoreElements())
        {
            String s = (String)e.nextElement();
            System.out.println(s);
        }

        //判断
        System.out.println(vector.contains("西瓜"));
        System.out.println(vector.isEmpty());

        //其他方法
//      vector.firstElement(),vector.lastElement(),vector.elementAt()
    }
}

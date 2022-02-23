package annotation;

import java.util.ArrayList;
import java.util.List;

public class Test01 extends Object{
    //@Override，重写的注解
    @Override
    public String toString() {
        return super.toString();
    }
    //Deprecated，不推荐程序员使用的程序元素，通常是危险的，或者是有更好的替代
    @Deprecated
    public static void test()
    {
        System.out.println("Deprecated");
    }
    //镇压警告，可以放在类的前面
    @SuppressWarnings("all")
    public void test02()
    {
        List list = new ArrayList();
    }

    public static void main(String[] args) {
        test();
    }
}

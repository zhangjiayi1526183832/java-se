package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//分析性能问题
public class Test09 {
    //正常方式
    public static void test1()
    {
        User user1 = new User();
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            user1.getName();
        }
        long endtime = System.currentTimeMillis();
        System.out.println("正常方式执行10亿次:"+(endtime-starttime)+"ms");
    }
    //反射方式
    public static void test2() throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Class c1 = Class.forName("reflect.User");
        User user2 = (User) c1.newInstance();
        Method getName = c1.getMethod("getName", null);
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user2,null);
        }
        long endtime = System.currentTimeMillis();
        System.out.println("反射方式执行10亿次:"+(endtime-starttime)+"ms");
    }
    //关闭监测
    public static void test3() throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Class c1 = Class.forName("reflect.User");
        User user3 = (User) c1.newInstance();
        Method getName = c1.getMethod("getName", null);
        getName.setAccessible(true);
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user3,null);
        }
        long endtime = System.currentTimeMillis();
        System.out.println("关闭监测方式执行10亿次:"+(endtime-starttime)+"ms");
    }

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        test1();
        test2();
        test3();
    }
}

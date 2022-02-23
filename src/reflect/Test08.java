package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//通过反射动态创建对象
public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //使用此方法时，定义的类中必须有无参构造器
        Class<?> c1 = Class.forName("reflect.User");
        User user1 = (User)c1.newInstance();
        System.out.println(user1);

        Constructor<?> constructor = c1.getConstructor(String.class, int.class, int.class);
        User user2 = (User) constructor.newInstance("张家易", 2005210128, 19);
        System.out.println(user2);

        User user3 = (User) c1.newInstance();
        Method setName = c1.getMethod("setName", String.class);
        setName.invoke(user3,"张家易");//激活方法
        System.out.println(user3);

        User user4 = (User) c1.newInstance();
        Field name = c1.getDeclaredField("name");
        //setAccessible属性权限的安全开关
        name.setAccessible(true);//默认为false，表示是打开安全监测，此时设置为true，表示关闭安全监测。因为私有属性不能直接操作，所以说必须关闭安全监测
        name.set(user4,"张家易");//因为name是private属性，直接编译会抛出异常
        System.out.println(user4);
    }
}

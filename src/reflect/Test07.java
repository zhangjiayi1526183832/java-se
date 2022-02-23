package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("reflect.User");
        //获得类的名字
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
        System.out.println("-----------------");
        //获得类的属性
        Field[] fields = c1.getFields();//只能找到public属性
        Field[] declaredFields = c1.getDeclaredFields();//获取所有属性
        for(Field field:declaredFields)
        {
            System.out.println(field);
        }
        //获得指定属性的值
//        Field name = c1.getField("name");
//        System.out.println(name);
        Field name = c1.getDeclaredField("name");
        System.out.println(name);
        System.out.println("-----------------");
        //获得类的方法
//        for (Method method : c1.getMethods()) {//活的本类及其父类的public方法
//            System.out.println(method);
//        }
//        System.out.println("-----------------");
//
//        for (Method declaredMethod : c1.getDeclaredMethods()) {//获得本类的全部方法
//            System.out.println(declaredMethod);
//        }
        //获得指定的方法
        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);
        //获得指定的构造器
        for (Constructor constructor : c1.getConstructors()) {
            System.out.println(constructor);
        }

        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println(declaredConstructor);

    }
}

package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Reflect_stu {
    public static void main(String[] args) throws InvocationTargetException {
        //使用反射调用
        Class clazz = null;
        try {
            clazz = Class.forName("reflect.Apple");
            /********** Begin *********/
            Method setPrice = clazz.getMethod("setPrice",double.class);
            Apple apple = (Apple)clazz.newInstance();
            setPrice.invoke(apple,14);
            System.out.println(apple.getPrice());
            Method getTotal = clazz.getMethod("getTotal", double.class, int.class);
            System.out.println(getTotal.invoke(apple, 20, 24));
            /********** End *********/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


class Apple {
    private double price;
    private int count;

    public Apple() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getTotal(double price, int count) {
        return price * count;
    }
}
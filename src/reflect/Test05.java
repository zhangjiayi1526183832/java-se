package reflect;
//测试类什么时候会初始化
public class Test05 {
    static {
        System.out.println("main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //主动引用
//        Son son = new Son();
        //反射会产生主动引用
//        Class.forName("reflect.Son");
        //子类调用父类的静态变量，不会初始化子类,因为不产生引用
//        System.out.println(Son.b);
//        Son[] arrays = new Son[10];
        System.out.println(Son.M);
    }
}
class Father{
    static int b = 2;
    static {
        System.out.println("父类被加载");
    }
}
class Son extends Father{
    static {
        System.out.println("子类被加载");
        m = 300;
    }
    static int m = 100;
    static final int M = 1;
}

package Aggregate;

public class generic1Test {
    public static void main(String[] args) {
        //泛型类
        generic1<String> g = new generic1<>();
        g.t = "hello";
        g.show(g.t);
        String s = g.getT();
        System.out.println(s);
        //泛型接口
        genericinterfacetest1 gi = new genericinterfacetest1();
        gi.server("******");

        genericinterfacetest2<Integer> gi2= new genericinterfacetest2<>();
        gi2.server(544564);
        //泛型方法
        genericmethod1 gid = new genericmethod1();
        gid.show();
        gid.show("zhangsan");
    }
}

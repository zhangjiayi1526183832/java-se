package thread;

public class testLambda2 {
    public static void main(String[] args) {
        Ilove love = (int a) -> {
            System.out.println("i love you" + a);
        };
        //简化1：参数类型
        love = (a) -> {
            System.out.println("i love you" + a);
        };
        //简化2：简化括号
        love = a -> {
            System.out.println("i love you" + a);
        };
        //简化3：去掉大括号
        love = a -> System.out.println("i love you" + a);;
        love.love(521);
        //lambda表达式只能有一行代码的情况下才能简化成一行代码，如果有多行代码，就用代码行包括
        //前提是接口必须是函数式接口
        //多个参数也可以去掉参数类型，要去掉就都去掉，必须加上括号
    }
}

interface Ilove{
    void love(int a);
}

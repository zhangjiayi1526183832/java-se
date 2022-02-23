package thread;
//推导lambda表达式
public class teseLambda {
    //静态内部类
    static class Like2 implements iLike{
        @Override
        public void lambda() {
            System.out.println("I like lambda2");
        }
    }


    public static void main(String[] args) {
        iLike like = new Like();
        like.lambda();

        like = new Like2();
        like.lambda();
        //局部内部类
         class Like3 implements iLike{
            @Override
            public void lambda() {
                System.out.println("I like lambda3");
            }
        }

        like = new Like3();
        like.lambda();

        //匿名内部类:没有类的名称，必须借助接口或者父类
        like = new iLike() {
            @Override
            public void lambda() {
                System.out.println("I like lambda4");
            }
        };
        like.lambda();

        //用lambda简化
        like =()->{
            System.out.println("I like lambda5");
        };
        like.lambda();
    }
}
//定义一个函数式接口
interface iLike{
    void lambda();
}
//实现类
class Like implements iLike{
    @Override
    public void lambda() {
        System.out.println("I like lambda");
    }
}
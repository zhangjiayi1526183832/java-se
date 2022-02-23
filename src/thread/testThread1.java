package thread;
//创建线程方法一 继承Thread类
public class testThread1 extends Thread{
    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我在写代码"+i);
        }
    }

    public static void main(String[] args) {
        //主线程
        testThread1 testthread1 = new testThread1();
        testthread1.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("我在学习多线程" + i);
        }
        //编译结果证明两个线程同时进行，线程不一定立即执行，CPU安排调度
    }
}

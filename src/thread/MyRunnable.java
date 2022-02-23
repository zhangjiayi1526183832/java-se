package thread;
//创建线程方式2：实现Runnable接口
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        //run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我在写代码"+i);
        }
    }
    public static void main(String[] args) {
        //创建实现类对象
        MyRunnable myRunnable = new MyRunnable();
        //创建线程对象，通过线程对象开启我们的线程，代理
        Thread thread = new Thread(myRunnable);
        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("我在学习多线程" + i);
        }
        //编译结果证明两个线程同时进行，线程不一定立即执行，CPU安排调度
    }
}

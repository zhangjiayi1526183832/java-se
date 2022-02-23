package thread;
//多个线程同时操作同一个对象
public class test1 implements Runnable{
    private int ticketnumbers = 10;
    @Override
    public synchronized void run() {
        while (true)
        {
            if(ticketnumbers<=0)
            {
                break;
            }
            try {
                Thread.sleep(200);//模拟延时
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "拿到了第" + ticketnumbers-- + "张票");
        }
    }

    public static void main(String[] args) {
        test1 test = new test1();
        new Thread(test,"小明").start();
        new Thread(test,"小红").start();
        new Thread(test,"黄牛").start();
    }
}
//发现问题：多个线程操作同一个资源时，线程不安全，数据紊乱
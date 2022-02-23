package thread;
//模拟网络延时:放大问题的发生性
public class TestSleep implements Runnable{
    private int ticketnumbers = 10;
    @Override
    public void run() {
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
        TestSleep testSleep = new TestSleep();
        new Thread(testSleep ,"小明").start();
        new Thread(testSleep ,"小红").start();
        new Thread(testSleep ,"黄牛").start();
    }
}

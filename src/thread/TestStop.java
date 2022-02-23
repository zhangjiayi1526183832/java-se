package thread;

//测试停止线程，建议线程正常停止--->利用次数，不建议死循环
//建议使用标志位--->设置一个标志位
//不要使用stop或者distory等过时或者JDK不建议的方法

public class TestStop implements Runnable{
    //设置一个标志位
    private boolean flag = true;
    @Override
    public void run() {
        int i = 0;
        while (flag)
        {
            System.out.println("run...Thread"+i++);
        }
    }

    public void stop()
    {
        this.flag = false;
    }

    public static void main(String[] args) {
        TestStop testStop = new TestStop();
        new Thread(testStop).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("main" + i);
            if (i==900)
            {
                //调用stop切换标志位，让线程停止
                testStop.stop();
                System.out.println("线程该停止了");
            }
        }
    }
}

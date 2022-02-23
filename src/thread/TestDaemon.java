package thread;

public class TestDaemon {
    public static void main(String[] args) {
        You you =new You();
        God god = new God();
        Thread thread = new Thread(god);
        thread.setDaemon(true);//默认是false，表示用户线程，正常的线程都是用户线程
        thread.start();
        new Thread(you).start();//用户线程启动
    }
}

class You implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("你活着");
        }
        System.out.println("你死了");
    }
}

class God implements Runnable{
    @Override
    public void run() {
        while(true)
        {
            System.out.println("上帝保佑你");
        }
    }
}
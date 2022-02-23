package thread.higher;
//信号灯法
public class TestPC2 {
    public static void main(String[] args) {
        TV tv = new TV();
        new Player(tv).start();
        new Watcher(tv).start();
    }
}
//演员
class Player extends Thread {
    TV tv;

    public Player(TV tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if(i%2==0)
            {
                this.tv.play("播放节目");
            }
            else {
                this.tv.play("播放广告");
            }
        }
    }
}
//观众
class Watcher extends Thread {
    TV tv;

    public Watcher(TV tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            this.tv.watch();
        }
    }
}
//节目
class TV{
    //演员表演，观众等待 T
    //观众观看，演员等待 F
    String voice;
    boolean flag = true;
    //表演
    public synchronized void play(String voice)
    {
        if(!flag)
        {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("演员表演了"+voice);
        this.notifyAll();//通知唤醒
        this.voice = voice;
        this.flag = !this.flag;
    }
    public synchronized void watch()
    {
        if(flag)
        {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("观看了"+voice);
        //通知演员表演
        this.notifyAll();
        this.flag = !this.flag;
    }
}
package thread.syn;
//多个线程互相抱着对方需要的资源，然后形成僵持
public class DeadLock {
    public static void main(String[] args) {
        Makeup m1 = new Makeup(0,"灰姑凉");
        Makeup m2 = new Makeup(1,"公主");
        m1.start();
        m2.start();
    }
}
class LipStick
{}
class Mirror
{}
class Makeup extends Thread
{
    static LipStick lipStick = new LipStick();
    static Mirror mirror = new Mirror();
    int choice;
    String name;
    Makeup(int choice,String name)
    {
        this.choice = choice;
        this.name = name;
    }
    @Override
    public void run() {
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //化妆，互相持有对方的锁，需要拿到对方的资源
    private void makeup() throws InterruptedException {
        if(choice==0)
        {
            synchronized (lipStick)//获得口红的锁
            {
                System.out.println(this.name+"获得口红的锁");
                Thread.sleep(1000);
            }
            synchronized (mirror)//一秒钟后想获得镜子
            {
                System.out.println(this.name+"获得镜子的锁");
            }
        }
        else{
            synchronized (mirror)//获得镜子的锁
            {
                System.out.println(this.name+"获得镜子的锁");
                Thread.sleep(1000);
            }
            synchronized (lipStick)//一秒钟后想获得口红
            {
                System.out.println(this.name+"获得口红的锁");
            }
        }
    }

}
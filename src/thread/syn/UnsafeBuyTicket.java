package thread.syn;


/**
 * 不安全的买票
 */

public class UnsafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        new Thread(buyTicket,"张三").start();
        new Thread(buyTicket,"李四").start();
        new Thread(buyTicket,"王五").start();
    }
}

class BuyTicket implements Runnable{
    private int ticketNumber = 10;
    private boolean flag = true;
    @Override
    public void run() {
        //买票
        while(flag)
        {
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //synchronized 同步方法，锁的是this
    private synchronized void buy() throws InterruptedException {
        if(ticketNumber<=0) {
            flag= false;
            return;
        }
        //模拟延时
        Thread.sleep(1);
        System.out.println(Thread.currentThread().getName()+"拿到"+ticketNumber--);
    }
}

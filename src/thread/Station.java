package thread;



public class Station extends Thread{

    static int ticketNumber = 20;
    static Object key = new Object();
    @Override
    public  void run() {
        while (ticketNumber>0)
        {
            synchronized (key)
            {
                if (ticketNumber>0)
                {
                    System.out.println("卖出了第"+ticketNumber+"张票");
                    ticketNumber--;
                }
            }
            if(ticketNumber==0)
            {
                System.out.println("票卖完了");
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

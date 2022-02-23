package thread;
//线程join--插队
public class testJoin implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("线程vip来了");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        testJoin tj = new testJoin();
        Thread thread = new Thread(tj);
        thread.start();
        for (int i = 0; i < 1000; i++) {
            if (i==200){
                thread.join();
            }
            System.out.println("main" + i);
        }
    }
}

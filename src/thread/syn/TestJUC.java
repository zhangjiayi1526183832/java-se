package thread.syn;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//测试juc安全类型的集合
public class TestJUC {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
               copyOnWriteArrayList.add(Thread.currentThread().getName());
            }).start();
        }
        Thread.sleep(1000);
        System.out.println(copyOnWriteArrayList.size());
    }
}

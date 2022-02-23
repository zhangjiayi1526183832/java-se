package thread;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

//线程创建方式3
public class testCallable implements Callable<Boolean> {
    @Override
    public Boolean call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"在写代码");
        }
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        testCallable t1 = new testCallable();
        testCallable t2 = new testCallable();
        testCallable t3 = new testCallable();
        //创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(3);
        //提交执行
        Future<Boolean> result1 = ser.submit(t1);
        Future<Boolean> result2 = ser.submit(t2);
        Future<Boolean> result3 = ser.submit(t3);
        //获取结果
        boolean rs1 = result1.get();
        boolean rs2 = result2.get();
        boolean rs3 = result3.get();
        //关闭服务
        ser.shutdownNow();
    }
}

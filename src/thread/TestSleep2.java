package thread;

import java.text.SimpleDateFormat;
import java.util.Date;

//模拟倒计时
public class TestSleep2 {
    public static void tenDown() throws InterruptedException {
        int num = 10;
        while(true)
        {

            for (int i = 0; i < num; i++) {
                Thread.sleep(1000);
                System.out.println(num--);
                if(num<0)
                    break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //打印当前系统时间
        Date starttime = new Date(System.currentTimeMillis());
        while (true)
        {
            Thread.sleep(1000);
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(starttime));
            starttime = new Date(System.currentTimeMillis());
        }

    }
}

package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日志工具
 */
public class logUtil {
    public static void log(String args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("E:\\java笔记\\a.txt",true));
        System.setOut(ps);
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strtime = sdf.format(dt);
        System.out.println("");
        System.out.println(strtime + ":" + args);
    }
}

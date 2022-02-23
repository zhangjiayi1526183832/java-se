package IO;

import java.io.*;

public class BufferedReader2 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("E:\\java笔记\\a.txt");
        //通过转化流转换(把字节流转换成字符流)
        InputStreamReader isr = new InputStreamReader(fis);//fis 节点流 isr 包装流
        //这个构造方法只能传字节流，不能传字符流
//        BufferedReader br = new BufferedReader(fis);
        BufferedReader br = new BufferedReader(isr);//isr 节点流 br 字符流

        String s = null;
        while((s= br.readLine())!=null)
        {
            System.out.println(s);
        }

        br.close();
    }
}

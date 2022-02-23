package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStream1 {
    public static void main(String[] args) throws FileNotFoundException {
        /*//联合起来写
        System.out.println("hello world");
        //分开写
        PrintStream ps = System.out;
        ps.print("hello java");*/
        //可以改变标准输出流的输出方向
        //标准输出流不再指向控制台，指向txt文件
        PrintStream ps = new PrintStream(new FileOutputStream("E:\\java笔记\\a.txt"));
        //修改输出方向，将输出方向修改到txt文件
        System.setOut(ps);
        //再输出
        System.out.println("hello world");
        System.out.println("hello java");

        ps.print("hello world");
        ps.print("hello java");
        //日志框架的实现原理
    }
}

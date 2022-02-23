package scanner;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接受键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式接受:");
        //判断用户有没有输入字符串
        if(scanner.hasNextLine())
        {
            //使用next方式接收
            String str  = scanner.nextLine();
            System.out.println("输出的内容为："+str);
        }

        scanner.close();//IO流的对象要关闭，否则会一直占用资源

    }
}

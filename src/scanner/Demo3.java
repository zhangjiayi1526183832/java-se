package scanner;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接受键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数据:");
        String str = scanner.nextLine();
        System.out.println("输出的数据为："+str);
        scanner.close();//IO流的对象要关闭，否则会一直占用资源

    }
}

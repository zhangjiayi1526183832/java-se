package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/* int read(byte[] b)一次最多读取b.length个字节 返回值是读取到的字节的数量,一个字节都读不到返回-1*/
/*在idea中默认的当前路径是project的根*/
public class FileInputStream3 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:\\java笔记\\a.txt");
            byte[] bytes = new byte[4];

            int readCount = fis.read(bytes);
            System.out.println(readCount);//第一次读取到4个字节
            //System.out.println(new String(bytes));//abcd
            System.out.println(new String(bytes, 0, readCount));

            readCount = fis.read(bytes);
            System.out.println(readCount);//第二次读取3个字节
            //System.out.println(new String(bytes));//efgd
            System.out.println(new String(bytes, 0, readCount));

            readCount = fis.read(bytes);
            System.out.println(readCount);//第三次读取不到，返回-1
            //System.out.println(new String(bytes));//efgd

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

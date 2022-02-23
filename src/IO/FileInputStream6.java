package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
 * available()返回流当中没有读取的字节的数量
 *skip()跳过几个字节不读
 * */
public class FileInputStream6{
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:\\java笔记\\a.txt");
            int readByte=fis.read();
            System.out.println("还剩下多少字节没有读:"+fis.available());
            byte[] bs = new byte[fis.available()];
//            System.out.println(new String(bs));
            fis.skip(2);
            System.out.println(fis.read());


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

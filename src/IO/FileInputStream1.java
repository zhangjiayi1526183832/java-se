package IO;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream1 {
    public static void main(String[] args) {
            //创建文件输入对象
        FileInputStream fis = null;
        try {
            fis =  new FileInputStream("E:\\java笔记\\a.txt");

            int readData = fis.read();//返回第一个字节的大小；调用一次read方法向后移一次,读取到没有数据返回-1；
            System.out.println(readData);

            readData = fis.read();
            System.out.println(readData);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //在finally语句中关闭流，前提是流不为空
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

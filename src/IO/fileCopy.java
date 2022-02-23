package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 拷贝的过程是边读边写，文件类型随意。
 */
public class fileCopy {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis  = new FileInputStream("E:\\java笔记\\a.txt");
            fos = new FileOutputStream("E:\\java笔记\\b.txt");

            byte[] bs = new byte[1024*1024];//一次最多拷贝1MB
            int readCount = 0;
            while((readCount=fis.read(bs))!=-1)
            {
                fos.write(bs,0,readCount);
            }

            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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

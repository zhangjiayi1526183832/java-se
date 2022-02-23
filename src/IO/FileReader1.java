package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("E:\\java笔记\\a.txt ");

            char[] chars = new char[5];
//            int readCount = 0;
//            while((readCount=fr.read(chars))!=-1)
//            {
//                System.out.println(new String(chars,0,readCount));
//            }
            fr.read(chars);
            for (char c:chars)
            {
                System.out.println(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

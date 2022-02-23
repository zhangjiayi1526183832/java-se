package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream2 {
    public static void main(String[] args) {
        FileInputStream fis = null ;
        try {
            fis = new FileInputStream("E:\\java笔记\\a.txt");

            while(true)
            {
                int readData = fis.read();
                if(readData==-1)
                {
                    break;
                }
                System.out.println(readData);
            }

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

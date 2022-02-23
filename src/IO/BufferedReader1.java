package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader1 {
    public static void main(String[] args) {

        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("E:\\java笔记\\a.txt");
            br = new BufferedReader(fr);

//            String firstLine = br.readLine();
//            System.out.println(firstLine);
//
//            String secondLine = br.readLine();
//            System.out.println(secondLine);

            String s = null;
            while ((s=br.readLine())!=null)
            {
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

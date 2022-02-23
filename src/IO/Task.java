package IO;

import java.io.*;

public class Task {

    public void task() throws IOException {
        /********* Begin *********/
        FileReader fr = new FileReader("src/step4/input/input.txt");
        FileWriter fw = new FileWriter("src/step4/output/output.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        String str  = "";
        while((str=br.readLine())!=null)
        {
            bw.write(str);
        }

        FileInputStream fis = new FileInputStream("src/step4/input/input.jpg");
        FileOutputStream fos = new FileOutputStream("src/step4/output/output.jpg");
        byte[] bs = new byte[1024*1024];
        int readCount = 0;
        while((readCount= fis.read(bs))!=-1)
            fos.write(bs,0,readCount);

        br.close();
        bw.flush();
        bw.close();
        fis.close();
        fos.flush();
        fos.close();
        /********* End *********/
    }

    public static void main(String[] args) throws IOException {
        Task t = new Task();
        t.task();
    }
}

package IO;

import java.io.*;

public class BufferedWriter1 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("myfile"));
        bw.write("hello world");
        bw.write("\n");
        bw.write("欢迎来到java");
        bw.flush();
        bw.close();

//      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("myfile",true)));转换流，追加写入

    }
}

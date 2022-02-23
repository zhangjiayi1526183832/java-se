package IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("myfile",true);

            char[] ch ={'我','是','中','国','人'};
            fw.write(ch,0,2);
//            fw.write("/n");//换行
            fw.write("我是一名java软件工程师");
            fw.flush();//每次斜纹一定记得刷新
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

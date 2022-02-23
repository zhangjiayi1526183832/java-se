package IO;

import java.io.File;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) throws IOException {
        File f = new File("hisfile");
        System.out.println(f.exists());//false表示文件不存在

        if (!f.exists()) {
            f.createNewFile();//以文件的形式新建
        }
        if(!f.exists())
        {
            f.mkdir();//以目录的形式新建出来，即文件夹
        }
        if(!f.exists())
        {
            f.mkdirs();//以多重目录的形式新建出来，即文件夹
        }

        f.getParent();//获取文件的父路径,返回字符串
        f.getParentFile();//返回文件
        f.getAbsoluteFile();//获取绝对路径
        f.getName();//获取文件名
        f.isDirectory();//判断是否为目录
        f.isFile();//判断是否为文件
        f.lastModified();//获取文件最后一次修改时间
        f.length();//获取文件大小
        f.listFiles();//获取当前目录下所有的子文件

    }
}

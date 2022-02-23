package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStream1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student"));
        //开始反序列化，读
        Object obj = ois.readObject();
        //反序列化返回一个学生对象，会调用学生的toString方法
        System.out.println(obj);
        ois.close();
    }
}

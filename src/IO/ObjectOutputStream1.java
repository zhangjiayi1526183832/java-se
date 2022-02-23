package IO;

import java.io.*;

public class ObjectOutputStream1 {
    public static void main(String[] args) throws IOException {
        Student s = new Student(01,"张三");
        //序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Student"));
        //序列化对象
        oos.writeObject(s);

        oos.flush();
        oos.close();
    }
}

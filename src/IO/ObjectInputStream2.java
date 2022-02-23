package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 反序列化集合
 */
public class ObjectInputStream2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student"));
        List<Student> studentList = (List<Student>)ois.readObject();
        for(Student s:studentList)
        {
            System.out.println(s);
        }
    }
}

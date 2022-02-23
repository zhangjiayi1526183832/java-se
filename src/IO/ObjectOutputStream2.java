package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 一次序列化多个对象
 */
public class ObjectOutputStream2 {
    public static void main(String[] args) throws IOException {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"zhangsan"));
        studentList.add(new Student(2,"lisi"));
        studentList.add(new Student(3,"wangwu"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Student"));
        //序列化集合，集合中放了许多其他的对象
        oos.writeObject(studentList);


        oos.flush();
        oos.close();
    }
}

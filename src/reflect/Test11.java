package reflect;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

//反射获取注解信息，利用注解和反射完成类和表结构的映射关系
public class Test11 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        //获取类的注解信息
        Class c1 = Class.forName("reflect.Student2");
        ZhangTable zhangTable = (ZhangTable)c1.getAnnotation(ZhangTable.class);
        String name = zhangTable.name();
        System.out.println(name);

        //获取类的属性的注解信息
        Field declaredField = c1.getDeclaredField("name");
        Filed filed = (Filed)declaredField.getAnnotation(Filed.class);
        System.out.println(filed.columnName());
        System.out.println(filed.type());
        System.out.println(filed.length());
    }
}

@ZhangTable(name = "db_student")
class Student2{
    @Filed(columnName = "name",type = "varchar",length = 3)
    String name;
    @Filed(columnName = "name",type = "int",length = 10)
    int id;
    @Filed(columnName = "name",type = "int",length = 10)
    int age;

    public Student2() {
    }

    public Student2(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface ZhangTable
{
    String name();
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Filed
{
    String columnName();
    String type();
    int length();
}


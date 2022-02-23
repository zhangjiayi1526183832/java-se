package reflect;
//测试class的创建方式
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是"+person.name);
        //方式一，通过对象获得
        Class c1 = person.getClass();
        //方式二，通过forname获得
        Class c2 = Class.forName("reflect.Student");
        //方式三，通过类名.class获得
        Class c3 = Student.class;
        //方式四，基本内置数据类型包装类都有type属性
        Class c4 = Integer.TYPE;

        Class c5 = c1.getSuperclass();//获得父类类型
        System.out.println(c5);

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
    }
}

class Person{
    String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person{
    public Student()
    {
        this.name = "学生";
    }
}

class Teacher extends Person{
    public Teacher()
    {
        this.name = "老师";
    }
}
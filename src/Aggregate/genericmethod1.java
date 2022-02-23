package Aggregate;

public class genericmethod1
{
    public <T>void show(){
        System.out.println("hello world");
    }

    public <T> T show(T t)
    {
        System.out.println(t);
        return t;
    }


}

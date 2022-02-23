package Aggregate;

public class genericinterfacetest1 implements genericinterface1<String>
{
    public String server(String s) {
        System.out.println(s);
        return s;
    }
}

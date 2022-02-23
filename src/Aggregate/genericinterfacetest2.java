package Aggregate;

public class genericinterfacetest2<T> implements genericinterface1<T>{
    @Override
    public T server(T t) {
        System.out.println(t);
        return t;
    }
}

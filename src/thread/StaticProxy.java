package thread;

public class StaticProxy {
    public static void main(String[] args) throws Exception {
        weddingCompany weddingcompany = new weddingCompany(new you());
        weddingcompany.HappyMarried();
    }
}

interface married
{
    void HappyMarried();
}

class you implements married
{
    @Override
    public void HappyMarried() {
        System.out.println("你要结婚了");
    }
}

class weddingCompany implements married
{
    private married target;

    public weddingCompany(you you) {
        this.target = you;
    }

    @Override
    public void HappyMarried() {
        before();
        this.target.HappyMarried();
        after();
    }

    private void after() {
        System.out.println("结婚之后收尾款");
    }

    private void before() {
        System.out.println("结婚之前");
    }
}
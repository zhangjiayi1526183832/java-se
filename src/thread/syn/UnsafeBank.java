package thread.syn;
//不安全的取钱
public class UnsafeBank {
    public static void main(String[] args) {
        Account account = new Account(100,"结婚钱");
        Drawing you = new Drawing(account,50,"你");
        Drawing girlfriend = new Drawing(account,100,"女朋友");
        you.start();
        girlfriend.start();
    }
}

class Account{
    int money;
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

class Drawing extends Thread{
    Account account;//账户
    int drawingMoney;//取了多少钱
    int nowMoney;//现在手上有多少钱
    public Drawing(Account account,int drawingMoney,String name)
    {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }
    public  void run()
    {
        synchronized(account)
        {
            if (this.account.money-this.drawingMoney<0)
            {
                System.out.println(Thread.currentThread().getName()+"余额不够，不能取钱");
                return;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.money-=drawingMoney;
            nowMoney+=drawingMoney;
            System.out.println(account.name+"余额："+account.money);
            System.out.println(Thread.currentThread().getName()+"手上的钱："+this.nowMoney);
        }

    }
}

package thread.higher;

import java.util.SortedMap;

//管程法
//生产者，消费者，产品，缓冲区
public class TestPC {
    public static void main(String[] args) {
        Container container = new Container();
        new Productor(container).start();
        new Consumer(container).start();

    }
}

class Productor extends Thread {
    Container container ;

    public Productor(Container container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("生产了"+i+"只鸡");
            try {
                container.putChicken(new Chicken(i));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Consumer extends Thread {
    Container container;

    public Consumer(Container container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("消费了-->"+container.pop().id+"只鸡");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Chicken {
    int id;

    public Chicken(int id) {
        this.id = id;
    }
}
class Container {
    Chicken[] chickens = new Chicken[10];
    int count = 0;
    public synchronized void putChicken(Chicken chicken) throws InterruptedException {
        if (count==chickens.length)//容器满了
        {
            //通知消费者消费，生产者等待
            this.wait();
        }
        //如果没有满，丢入产品
        chickens[count] = chicken;
        count++;
        //通知消费者消费
        this.notify();
    }
    public synchronized Chicken pop() throws InterruptedException {
        //判断能否消费
        if(count==0)
        {
            //通知生产者生产,消费者等待
            this.wait();
        }
        count--;
        Chicken chicken = chickens[count];
        //吃完了，通知生产者生产
        this.notify();
        return chicken;

    }
}
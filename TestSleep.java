package ThreadStudy;

public class TestSleep{
    public static void main(String[] args) {
        haha h = new haha();
        new Thread(h,"线程A").start();
        new Thread(h,"线程B").start();
    }
}
class haha  implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始执行");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"线程终止结束");
    }
}
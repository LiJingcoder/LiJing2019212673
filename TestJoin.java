package ThreadStudy;

public class TestJoin implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("VIP来了"+i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
       //启动我的线程
        TestJoin testJoin = new TestJoin();
        Thread t = new Thread(testJoin);
        t.start();
        //主线程
        for (int i = 0; i < 50; i++) {
            System.out.println("main"+i);
            if(i==20){
                t.join();
            }
        }
    }
}

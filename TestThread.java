package ThreadStudy;

public class TestThread implements Runnable {
    private int ticket = 10;
    public void run() {
        for (int i = 0; i < 100; i++) {
            this.sale();
        }
    }
    public synchronized void sale(){
        if(ticket>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("卖票：ticket="+ticket--);
        }
    }
    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        new Thread(t1, "小明").start();
        new Thread(t1, "老师").start();
        new Thread(t1, "黄牛党").start();
    }
}
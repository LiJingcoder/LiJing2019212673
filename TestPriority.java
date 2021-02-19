package ThreadStudy;

public class TestPriority implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(Thread.currentThread().getName()+"运行，i="+i);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new TestPriority(),"A");
        Thread t2 = new Thread(new TestPriority(),"B");
        Thread t3 = new Thread(new TestPriority(),"C");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}

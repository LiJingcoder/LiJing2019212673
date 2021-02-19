package ThreadStudy;

public class TestStop implements Runnable{
    boolean flag = true;
    @Override
    public void run() {
        int i = 0;
        while (flag){
        System.out.println("run   Thread"+i++);
        }
    }
    public void stop(){
        this.flag=false;
    }
    public static void main(String[] args) {
        TestStop t1 = new TestStop();
        new Thread(t1).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("main"+i);
            if(i==900){
                t1.stop();
                System.out.println("线程该停止了");
            }
        }
    }
}

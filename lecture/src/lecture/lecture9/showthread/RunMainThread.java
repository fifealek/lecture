package lecture.lecture9.showthread;

public class RunMainThread {


    public static void main(String ... args) throws Exception {

        Runnable r = new SimpleFirst();
        Thread thread=new Thread(r);
        thread.start();

        thread.join();

        thread=new SimpleSecond();
        //thread.start();

        r = new StopThread();
        Thread t1= new Thread(r);
        t1.start();
        Thread.sleep(10);
        t1.interrupt();
        Thread.sleep(10000);

    }

}

package lecture.lecture9.showthread;

public class StopThread implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("start thread");
            long count = 0;
            while (!Thread.currentThread().isInterrupted()) {
                ++count;
                if(count==1)System.out.println("running" +(count));
             //Thread.sleep(10);
            }
            System.out.println("count "+count);
            System.out.println("stop thread");
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

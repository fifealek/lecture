package lecture.lecture9.priority;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainPriorityThreads {

    public static void main (String ...args) {
        ExecutorService executor= Executors.newCachedThreadPool();
        executor.execute(new ShowPriorityThread(Thread.MIN_PRIORITY));
        executor.execute(new ShowPriorityThread(Thread.MAX_PRIORITY));
        try {
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e) {
            e.getStackTrace();
        }

        executor.shutdownNow();
    }

}

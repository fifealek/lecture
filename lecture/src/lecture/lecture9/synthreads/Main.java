package lecture.lecture9.synthreads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {


    public static void main(String args[]) throws Exception {

        Contener contener =new Contener();

        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(new Producer(contener));
        executor.execute(new Consumer(contener));


        Thread.sleep(5000);
        executor.shutdownNow();
    }
}

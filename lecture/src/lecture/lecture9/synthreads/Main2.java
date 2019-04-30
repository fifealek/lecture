package lecture.lecture9.synthreads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main2 {

    public static void main(String args[]) throws Exception {
        Contener contener = new Contener();
        //List<Future<Integer>> array = new ArrayList();
        ExecutorService exe = Executors.newFixedThreadPool(2);
        exe.submit(new Producer(contener));

        Future<Integer> future = exe.submit(new FutureElement(contener));
        boolean flag = false;
        while (future.isDone()==false)Thread.sleep(100);
        //if (future.isDone()) {
            System.out.println("sum " + future.get());
        //}

        exe.shutdownNow();
    }

}

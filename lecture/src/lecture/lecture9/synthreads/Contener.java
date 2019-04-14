package lecture.lecture9.synthreads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Contener {

    private Vector vector = new Vector();
    //private List vector = new ArrayList();
    private boolean isProduce = false;

    public synchronized void produce() throws InterruptedException {
        isProduce = false;
        Random random = new Random();
        System.out.println("##########");
        while (!isProduce) {
            for (int t = 0; t < 300; t++) {

                vector.add(random.nextInt(300));
                System.out.println("produce " + vector.get(t));
            }
            isProduce = true;
        }
        wait();
    }

    public synchronized void consume() throws Exception {
        while (isProduce) {
            for (int t = 0; t < vector.size(); t++) {
                Object o = vector.get(t);
                System.out.println("consume " + o);
                vector.remove(o);
            }
            isProduce = false;
        }
        System.out.println("size " + vector.size());
        // wait();
        notifyAll();
    }

}

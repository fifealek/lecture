package lecture.lecture9.synthreads;

public class Producer implements Runnable {

    private Contener contener;

    public Producer(final Contener contener) {
        this.contener = contener;
    }

    @Override
    public void run() {

        try {
            while (!Thread.interrupted()) {
                contener.produce();
               // Thread.sleep(20);
            }
        } catch (InterruptedException e) {
            e.getStackTrace();
        }

    }
}

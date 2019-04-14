package lecture.lecture9.synthreads;

public class Consumer implements Runnable {

    private Contener contener;

    public Consumer(final Contener contener) {
        this.contener = contener;
    }

    @Override
    public void run() {
        try {

            while(!Thread.interrupted()) {

              contener.consume();
                Thread.sleep(20);
            }
        }
        catch (Exception e) {
            e.getStackTrace();
        }

    }
}

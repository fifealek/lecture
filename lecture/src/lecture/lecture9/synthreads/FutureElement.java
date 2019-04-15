package lecture.lecture9.synthreads;

import java.util.concurrent.Callable;

public class FutureElement implements Callable<Integer> {

    private Contener contener;

    public FutureElement(final Contener contener) {
        this.contener = contener;
    }

    @Override
    public Integer call() throws Exception {
        return contener.getVectorSum();
    }
}

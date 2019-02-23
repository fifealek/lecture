package lecture.lecture6.exception.chain;

import lecture.lecture6.exception.ConnectedException;
import lecture.lecture6.exception.ShowException;

public class ServiceImpl implements Service {

    private String arg;
    private ConnectedException ce;

    public ServiceImpl(final String arg, final ConnectedException ce) {
        this.arg = arg;
        this.ce = ce;
        try {
            checkObjectStat();
        } catch (FieldChecker fc) {
            NullPointerException nullPointerException = new NullPointerException();
            nullPointerException.initCause(fc);
            throw nullPointerException;
        }


    }

    @Override
    public void checkObjectStat() {
        if (ce == null) {
            throw new FieldChecker("Field ce is null");
        }

        if (arg == null) {
            throw new FieldChecker("Field arg is null");
        }
    }

    @Override
    public void run() {

    }
}

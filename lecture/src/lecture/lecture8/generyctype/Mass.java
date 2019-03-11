package lecture.lecture8.generyctype;

import java.io.Serializable;

public class Mass extends AbstractMass implements Serializable {

    final private int weght;

    public Mass(final int weght) {
        this.weght = weght;
    }

    public int getWeght() {
        return weght;
    }

    @Override
    int count() {
        return 0;
    }
}

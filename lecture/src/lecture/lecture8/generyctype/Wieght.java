package lecture.lecture8.generyctype;

import java.io.Serializable;

public class Wieght extends Mass implements Serializable {

  final private int size;

    public Wieght(final int weght, final int size) {
        super(weght);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public int count(){
        return 1;
    }

    @Override
    public String toString() {
        return "Wieght{" +
               "size=" + size +
               '}';
    }
}

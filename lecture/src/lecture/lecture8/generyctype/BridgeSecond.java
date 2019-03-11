package lecture.lecture8.generyctype;

public class BridgeSecond<T extends AbstractMass> {
    final private T t;

    public BridgeSecond(final T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public int calculate(){
        return t.count();
    }

    @Override
    public String toString() {
        return "BridgeSecond{" +
               "t=" + t +
               '}';
    }
}

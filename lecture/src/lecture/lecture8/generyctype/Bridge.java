package lecture.lecture8.generyctype;

public class Bridge<A> {

    final private A a;
    final private Integer v;

    public Bridge(final A a, final Integer v) {
        this.a = a;
        this.v = v;
    }


    public A getA() {
        return a;
    }

    public Integer getV() {
        return v;
    }

    @Override
    public String toString() {
        return "Bridge{" +
               "a=" + a +
               ", v=" + v +
               '}';
    }
}

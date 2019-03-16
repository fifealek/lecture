package lecture.lection10.adapter;

public class Cycle extends Shape {

    private double r;

    public Cycle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double space() {
      return 3.14d*r*r;
    }
}

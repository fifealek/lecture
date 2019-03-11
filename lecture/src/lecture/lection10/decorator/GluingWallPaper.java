package lecture.lection10.decorator;

public class GluingWallPaper extends FixedDecorator {
    private Fixed fixed;

    public GluingWallPaper(Fixed fixed) {
        this.fixed = fixed;
    }

    @Override
    public double cost() {
        return fixed.cost() + 2000;
    }

    @Override
    public String toString() {
        return "GluingWallPaper{" +
                "fixed=" + fixed +
                '}';
    }
}

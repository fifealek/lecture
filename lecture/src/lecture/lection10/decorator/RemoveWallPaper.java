package lecture.lection10.decorator;

public class RemoveWallPaper extends FixedDecorator {
 private Fixed fixed;

    public RemoveWallPaper(Fixed fixed) {
        this.fixed = fixed;
    }

    @Override
    public double cost() {
        return fixed.cost()+1000;
    }
}

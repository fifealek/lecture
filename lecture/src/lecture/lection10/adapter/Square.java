package lecture.lection10.adapter;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double space() {
     return side*side;
    }
}

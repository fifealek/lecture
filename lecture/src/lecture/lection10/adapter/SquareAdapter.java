package lecture.lection10.adapter;

public class SquareAdapter extends Shape {

    private Square square;

    public SquareAdapter(Square square) {
        this.square = square;
    }

    public Square getSquare() {
        return square;
    }

    @Override
    public double space() {
        double r = Math.sqrt((square.getSide()*square.getSide()+square.getSide()*square.getSide()));
        return Math.round(3.14d*r*r);
    }
}

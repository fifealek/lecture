package lecture.lection10.adapter;

public class Run {

    public static void main(String ... args){
        Square square = new Square(10);
        SquareAdapter squareAdapter = new SquareAdapter(square);
        System.out.println(squareAdapter.space());
    }
}

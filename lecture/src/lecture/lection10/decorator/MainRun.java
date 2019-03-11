package lecture.lection10.decorator;

import java.util.LinkedList;

public class MainRun {

    public static Fixed getFixedType(){
        Fixed fixed = new FixeRoom();
        fixed = new RemoveWallPaper(fixed);
        fixed = new GluingWallPaper(fixed);
      return fixed;
    }

    public static void main(String ... args) {
        Fixed fixed = new FixeRoom();
        fixed = new RemoveWallPaper(fixed);
        fixed = new GluingWallPaper(fixed);
        double fixedPrice = fixed.cost(); System.out.println("FixedPrice : "+fixedPrice);

        LinkedList linkedList = new LinkedList();
    }
}

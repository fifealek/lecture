package lecture.lecture4.declarationclass;

import java.util.Random;

public class Block {

    static int adding=add("initialize a adding value ");
    int p=1;
    String message = "Description";

    public Block() {
        System.out.println("message = "+message+" adding = "+adding );
        System.out.println("class Block");
    }

    static int add(String message) {
        Random random = new Random();
        int a=random.nextInt(15);
        System.out.println(message+a);
        return a;
    }

}

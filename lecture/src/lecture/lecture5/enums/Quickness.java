package lecture.lecture5.enums;

import java.util.Random;

public enum Quickness {

    LOW(30),
    MIDDLE(50),
    HIGH(80);

    private double quickness;

    private Quickness(double quckness) {
        this.quickness = quckness;
    }

    public static Quickness getRandomQuickness() {
        Random r = new Random();
       Quickness[] quicknesses = Quickness.values();
       int i= r.nextInt(quicknesses.length);
       return quicknesses[i];
    }

    public  Quickness getRandomQuickness1() {
        Random r = new Random();
        Quickness[] quicknesses = Quickness.values();
        int i= r.nextInt(quicknesses.length);
        return quicknesses[i];
    }
}

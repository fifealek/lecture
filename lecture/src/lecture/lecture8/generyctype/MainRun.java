package lecture.lecture8.generyctype;

import java.io.Serializable;

public class MainRun {

    public static void main(String... arg) {
        Mass m = new Mass(30);
        Bridge<Mass> bridge = new Bridge(m, 10);
        System.out.println(bridge.getA().getWeght());
        Serializable s = new Wieght(10, 15);
        Bridge<Serializable> bridge1 = new Bridge(s, 100);
        System.out.println(bridge1);

    }
}

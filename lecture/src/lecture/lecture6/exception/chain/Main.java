package lecture.lecture6.exception.chain;

import lecture.lecture6.exception.ConnectedException;

public class Main {

    public static void main(String... args) {
        try {
            Service service = new ServiceImpl(null, new ConnectedException());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String a = "dfdfsfadsf";
            Service service = new ServiceImpl(a, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

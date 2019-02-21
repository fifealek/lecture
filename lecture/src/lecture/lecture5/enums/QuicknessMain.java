package lecture.lecture5.enums;

public class QuicknessMain {

    public static String getMessage(Quickness typequikness) {
        String message = "";
        switch (typequikness) {
            case LOW:
                message = "ok";
                break;
            case MIDDLE:
                message = "ok";
                break;
            case HIGH:
                message = "fine";
                break;
            default:
                message = "Can find";
        }

        return message;
    }

    public static void main(String... args) {

        for (int t = 0; t < 10; t++) {
            Quickness typequikness = Quickness.getRandomQuickness();

            System.out.println(typequikness + " " + getMessage(typequikness));
        }

    }
}

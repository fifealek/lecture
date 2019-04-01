package lecture.lecture7.nio;

import java.util.Scanner;

public class MessageMain {

    static String message[] = {"You can count peremiter and area ", "Size", ""};
    static Scanner scanner = new Scanner(System.in);

    public static void main(String... args) {
        boolean isLoop = false;
        for (int t = 0; t < message.length; t++) {
            isLoop = true;
            while (isLoop) {
                System.out.println(message[t]);
                try {
                    if(scanner.hasNext()){
                    double enterNumber = scanner.nextDouble();
                    }
                    isLoop = false;
                } catch (Exception e) {
                    //scanner.reset();
                    scanner = new Scanner(System.in);
                    System.out.println("you did wrong data try again");
                    continue;
                }

            }
        }
    }

}

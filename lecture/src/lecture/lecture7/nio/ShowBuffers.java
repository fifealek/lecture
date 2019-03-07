package lecture.lecture7.nio;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class ShowBuffers {

    private static String MESSAGE = "something";

    public static void showBufferMethods() {
        int size = MESSAGE.length() * 2;
        ByteBuffer byteBuffer = ByteBuffer.allocate(size);
        CharBuffer charBuffer = byteBuffer.asCharBuffer();
        charBuffer.put(MESSAGE.toCharArray());
        charBuffer.flip();
        charBuffer.position(5);
        System.out.println("Pointer to char that will showed "+charBuffer.position());
        System.out.println("Count of char that was showed "+charBuffer.length());

        for (int t = charBuffer.length(); t < charBuffer.capacity(); t++) {
            System.out.print(charBuffer.get(t));
        }
        System.out.println();
        for (int t = 0; t < charBuffer.capacity(); t++) {
            System.out.print(charBuffer.get(t));
        }
        System.out.println();
        for (int t = 0; t < charBuffer.position(); t++) {
            System.out.print(charBuffer.get(t));

        }
          charBuffer.rewind();// push on zero position

        System.out.println();
        System.out.println(charBuffer.position());
        String position="";
        String limit = "";
        for (int t = 0; t < charBuffer.capacity(); t++) {
            System.out.print(charBuffer.get());
            position=position+charBuffer.position();
            limit = limit +charBuffer.limit();
        }
        System.out.println();
        System.out.println(position);

        System.out.println(limit);

    }

    public static void main(String... args) {
        showBufferMethods();
    }
}

package lecture.lecture7.inputstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.CharArrayReader;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputToWrite {

    private static String SAVE_MESSAGE = "Message";
    private static String FILENAME = "Message.txt";
    private static int BUFFER_SIZE = 1024;
    private static void changeOutputToWrite() throws Exception {
        FileOutputStream out =new FileOutputStream(FILENAME);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
        writer.write(SAVE_MESSAGE);
        writer.flush();
        writer.close();
    }

    private static void charRead() throws Exception {
        java.io.CharArrayReader charArrayReader = new CharArrayReader(SAVE_MESSAGE.toCharArray());
        BufferedReader br=new BufferedReader(charArrayReader);
        String line = br.readLine();
        System.out.println(line);
    }

    public static void main(String ...args) throws Exception {
        changeOutputToWrite();
        charRead();
    }
}

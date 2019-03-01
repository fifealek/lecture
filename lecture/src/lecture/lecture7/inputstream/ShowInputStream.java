package lecture.lecture7.inputstream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringReader;

public class ShowInputStream {

    private static String MESSAGE = "HELLO WORLD";
    private static String FILE_PATH =
            "/home/fife/lectures/lecture/lecture/src/lecture/lecture7/inputstream/ShowInputStream.java";
    private static String FILE_PATH1 =
            "/home/fife/lectures/lecture/lecture/ShowInputStream.java";
    private static String FILE_NAME = "ShowInputStream.java";

    public static void dataInputStream() throws IOException {
        java.io.DataInputStream dataInputStream = null;
        try {
            byte b[] = new String("Hello world").getBytes();
            DataInputStream inputStream = new DataInputStream(
                    new ByteArrayInputStream(b)
            );

            int size = inputStream.available();
            while ((size--) > 0) {
                System.out.println((char) inputStream.readByte());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (dataInputStream != null) {
                dataInputStream.close();
            }
        }

    }

    public static void bufferedInputStream() throws IOException {
        BufferedInputStream inputStream = null;
        try {
            inputStream = new BufferedInputStream(new ByteArrayInputStream(MESSAGE.getBytes()));
            int size = inputStream.available();
            while (size-- > 0) {
                System.out.println((char) inputStream.read());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }


    public static void dataInputStream(String fileName) throws IOException {
        java.io.DataInputStream dataInputStream = null;
        try {
            byte b[] = new String("Hello world").getBytes();
            DataInputStream inputStream = new DataInputStream(
                    new FileInputStream(fileName)
            );

            int size = inputStream.available();
            while ((size--) > 0) {
                System.out.print((char) inputStream.readByte());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (dataInputStream != null) {
                dataInputStream.close();
            }
        }

    }

    private static void stringReader(String fileName) {
        StringReader stringReader = null;
        try {
            stringReader = new StringReader(fileName);
            int c;
            while ((c = stringReader.read()) != -1) {
                System.out.println((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            stringReader.close();
        }

    }

    private static void readWrite(String fileName) throws IOException {
        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
            printWriter = new PrintWriter(new FileWriter(FILE_PATH));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
            printWriter.close();
        }
    }

    private static void randomAccessFile(String fileName, String rw) throws IOException {
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile(new File(fileName), rw);
           long size = randomAccessFile.length();
                   for(long l=0;l<size;l++) {
                       System.out.print((char)randomAccessFile.read());
                   }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        }

    }

    private static void print() {
        System.out.println("###############################################");
    }

    public static void main(String... args) throws IOException {
        dataInputStream();
        print();
        dataInputStream(FILE_PATH);
        print();
        bufferedInputStream();
        print();
        stringReader(MESSAGE);
        print();
        readWrite("/home/fife/lectures/lecture/lecture/src/lecture/lecture7/inputstream/ShowInputStream.java");
        print();
        randomAccessFile(FILE_PATH1,"r");
    }

}

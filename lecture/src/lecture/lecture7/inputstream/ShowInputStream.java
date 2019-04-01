package lecture.lecture7.inputstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringReader;
import java.util.Random;

public class ShowInputStream {

    private static String MESSAGE = "HELLO WORLD";
    private static String FILE_PATH =
            "/home/fife/lectures/lecture/lecture/src/lecture/lecture7/inputstream/ShowInputStream.java";
    private static String FILE_PATH1 =
            "/home/fife/lectures/lecture/lecture/ShowInputStream.java";
    private static String FILE_NAME = "ShowInputStream.java";

    public static void dataInputStream() {
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
                close(dataInputStream);
        }

    }

    public static void bufferedInputStream() {
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
                close(inputStream);
            }
        }
    }


    public static void dataInputStream(String fileName) {
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

                close(dataInputStream);
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
            close(stringReader);
        }

    }

    private static void readWrite(String fileName) {
        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
            printWriter = new PrintWriter(new FileWriter(FILE_NAME));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(bufferedReader);
            close(printWriter);
        }
    }

    private static void randomAccessFile(String fileName, String rw) {
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile(new File(fileName), rw);
            long size = randomAccessFile.length();
            for (long l = 0; l < size; l++) {
                System.out.print((char) randomAccessFile.read());
            }
            Random random = new Random(size / 2);
            long l = 120;
            print();
            System.out.println(l);
            print();
            randomAccessFile.seek(l > 0 ? l : l * (-1));
            System.out.println(randomAccessFile.readLine());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (randomAccessFile != null) {
                close(randomAccessFile);
            }
        }

    }


    private static void close(Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void dataWrite(String fileName) throws IOException {
        DataOutputStream dataOutputStream = null;
        DataInputStream dataInputStream = null;
        try {
            dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)));
            dataOutputStream.writeDouble(1.22345d);
            dataOutputStream.writeChar('C');
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeUTF(MESSAGE);
            dataOutputStream.flush();
            dataOutputStream.close();

            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)));

            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readChar());
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readUTF());
            dataInputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (dataOutputStream != null) {
                dataOutputStream.close();
            }
        }

    }

    private static void print() {
        System.out.println("###############################################");
    }

    public static void main(String... args) throws IOException {
//        dataInputStream();
//        print();
//        dataInputStream(FILE_PATH);
//        print();
     //   bufferedInputStream();
       // print();
      //  stringReader(MESSAGE);
//        print();
     //   readWrite("/home/fife/lectures/lecture/lecture/src/lecture/lecture7/inputstream/ShowInputStream.java");
//        print();
//        randomAccessFile(FILE_PATH1, "r");
//        print();
        dataWrite("1.data");
//        print();
    }

}

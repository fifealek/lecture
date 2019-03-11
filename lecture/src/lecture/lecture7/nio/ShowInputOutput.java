package lecture.lecture7.nio;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;

public class ShowInputOutput {

    private static int BSIZE = 1024 * 1024 * 1024;

    private static void showChannel() throws Exception {
        FileChannel fileChannel = new FileOutputStream("data2.data").getChannel();
        fileChannel.write(ByteBuffer.wrap("something".getBytes()));
        fileChannel.close();

        FileChannel fileChannel1 = new FileInputStream("data2.data").getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(BSIZE);
        fileChannel1.read(byteBuffer);
        byteBuffer.flip();

        System.out.println(byteBuffer.asCharBuffer());
        byteBuffer.rewind();
        fileChannel.close();
        byteBuffer.clear();
        fileChannel = new FileOutputStream("data2.data").getChannel();
        fileChannel.write(ByteBuffer.wrap("something".getBytes("UTF-16BE")));
        fileChannel.close();
        fileChannel = new FileInputStream("data2.data").getChannel();
        byteBuffer.clear();
        fileChannel.read(byteBuffer);
        byteBuffer.flip();
        fileChannel.close();
        // byteBuffer.flip();

        System.out.println(byteBuffer.asCharBuffer());

        fileChannel = new FileOutputStream("data2.data").getChannel();
        byteBuffer = ByteBuffer.allocate("something".length() * 2);
        byteBuffer.asCharBuffer().put("something");
        fileChannel.write(byteBuffer);
        fileChannel.close();
        fileChannel = new FileInputStream("data2.data").getChannel();
        byteBuffer.clear();
        fileChannel.read(byteBuffer);
        byteBuffer.flip();
        // byteBuffer.flip();

        System.out.println(byteBuffer.asCharBuffer());


    }

    private static void saveUseChannel() throws Exception {
        FileChannel fileChannel = new RandomAccessFile("data.data", "rw").getChannel();
        IntBuffer intBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, BSIZE).asIntBuffer();
        for (int t = 0; t < BSIZE / 4; t++) {
            intBuffer.put(t);
        }
        fileChannel.close();


    }

    private static void saveUseOutput() throws Exception {
        FileOutputStream file = new FileOutputStream("data.data");
        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(
                file
        ));
        for (int t = 0; t < BSIZE / 4; t++) {
            dataOutputStream.writeInt(t);
        }

        file.close();
    }


    public static void main(String... args) throws Exception {
        showChannel();
        long start = System.currentTimeMillis();
        saveUseChannel();
        System.out.println(" Chanel output "+(System.currentTimeMillis() - start)/1000);

        start = System.currentTimeMillis();
        saveUseOutput();
        System.out.println("Output stream "+(System.currentTimeMillis() - start)/1000);
    }
}

package lecture.lecture7.inputstream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputToRead {

    private static String FILENAME = "ShowInputStream.java";

    private static void changeInputToRead() throws Exception{
        FileInputStream file =new FileInputStream(FILENAME);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(file));
        String line = null;
        while((line = bufferedReader.readLine())!=null) {
            System.out.println(line);
        }

        bufferedReader.close();

    }

    public static void main(String ... args) throws Exception{
        changeInputToRead();
    }

}

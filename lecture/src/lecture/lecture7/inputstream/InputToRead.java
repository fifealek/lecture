package lecture.lecture7.inputstream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputToRead {

    private static String FILENAME = "ShowInputStream.java";

    private static void changeInputToRead() throws Exception{
        FileInputStream file =new FileInputStream(FILENAME);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(file));
        String line = null;
        StringBuilder stringBuilder =new StringBuilder();
        while((line = bufferedReader.readLine())!=null) {
            System.out.println(line);
            //stringBuilder.append(line);
        }

        String s= stringBuilder.toString();
        bufferedReader.close();
        System.out.println(s);

    }

    public static void main(String ... args) throws Exception{
        changeInputToRead();
    }

}

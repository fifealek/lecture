package lecture.lecture6.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class ShowException implements UseFile{

    private static String FILE_NAME = "readMe.txt";
    private java.io.FileInputStream in = null;

    public void readFile(String fileName) throws FileNotFoundException, IOException {
        in = new java.io.FileInputStream(new java.io.File(fileName));
        java.io.InputStreamReader inputStream = new java.io.InputStreamReader(in);
        BufferedReader bufferedReader = new BufferedReader(inputStream);
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line + "\n");
        }
        bufferedReader.close();
        System.out.println(stringBuilder.toString());
    }


    public static void main(String... args) throws IOException {
        //java.io.IOError
        ShowException showException = new ShowException();
        try {
           // showException.readFile("1");
            showException.readFile("18.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (showException.in != null) {
                showException.in.close();
            }
        }

    }
}

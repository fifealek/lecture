package lecture.lecture6.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ConnectedException {

    private void read() {
        throw  new Unchecked();
    }


    private void readFile(ShowException s) {
        try {
            s.readFile("1");
        }catch (FileNotFoundException e) {
            Unchecked unchecked = new Unchecked();
            unchecked.addSuppressed(e);
            throw unchecked;
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void readFile(UseFile s) throws Checked {

        try {
            s.readFile("1");
        }catch (FileNotFoundException e) {
            Checked checked = new Checked();
            checked.addSuppressed(e);
            throw checked;
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String ... args) {

        ShowException showException = new ShowException();
        ConnectedException connected = new ConnectedException();

        try {
            connected.readFile(showException);
        }catch (Unchecked e) {
            e.printStackTrace();
        }

        try {
            connected.read();
        }catch (Unchecked e) {
            e.printStackTrace();
        }

        UseFile useFile = showException;
        try {
            connected.readFile(useFile);
        }catch (Checked e) {
            e.printStackTrace();
        }


    }

}

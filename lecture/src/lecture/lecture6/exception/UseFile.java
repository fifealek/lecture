package lecture.lecture6.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface UseFile {

    public void readFile(String s) throws FileNotFoundException, IOException;

}

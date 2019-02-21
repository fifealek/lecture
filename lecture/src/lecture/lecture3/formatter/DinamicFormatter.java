package lecture.lecture3.formatter;

import java.util.Formatter;

public class DinamicFormatter {

    private static Formatter format = new Formatter(System.out);

    public void printStrigUseTemplate(String template, Object ... objects) {
        format.format(template,objects);
    }
}

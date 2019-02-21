package lecture.lecture3;

import sun.java2d.pipe.SpanShapeRenderer;

import java.util.Formatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//https://docs.oracle.com/javase/tutorial/essential/regex/
public class IntroduceString {

    static  Scanner stdin = new Scanner(System.in);

    private static String TEMPLATE_SEARCH_STRING = "ABRldfFDRTMPRCDFHrhtlDFHI";
    private static String TEMPLATE_SEARCH_STRING1 = new String("ABRldfFDRTMPRCDFHrhtlDFHI").intern();

    private static String TEMPLATE_SPLIT_STRING = "ABRldfF77DRTMPRC7D777FHrhtlD777FHI";
    //private static String TEMPLATE_SEARCH_STRING = "RRRRRRR";
    private static String SEARCH_ELEMENT = "R";
    private static String TEMPLATEREXEXPRATION = "[+]\\d{2}-\\d{3}-\\d{3}-\\d{2}-\\d{2}";

    private static Pattern p = Pattern.compile(TEMPLATEREXEXPRATION);


    public static String inputData(String message) {
        System.out.println(message);
        return stdin.next();
    }



    public static void scaner() {
        Scanner stdin = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = stdin.nextLine();
        System.out.println(name);
        System.out.println("How old are you?");
        String age = stdin.next("\\d{2}");
    }


    public static boolean isNumberPhone(String phoneNumber) {
        Matcher m = p.matcher(phoneNumber);
        return m.matches();
    }

    public static void searching(StringBuilder stringBuilder, String searchElement, int startChar, Counter count) {

        StringBuffer stringBuffer;
        int lengthString = 0;

        if (stringBuilder != null) {
            lengthString = stringBuilder.length();
        } else {
            return;
        }

        int index;
        if (startChar < lengthString && (index = stringBuilder.indexOf(searchElement, startChar)) >= 0) {
            count.add();

            searching(stringBuilder, searchElement, index + 1, count);
        }

    }

    public static void stringBulder(String message, String searchElement) {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(message);

        Counter counter = new Counter(0);
        searching(stringBuilder, searchElement, 0, counter);
        System.out.println("countElement : " + counter);

    }

    public static void splitString(String string, String splitRegExp) {
        String array[] = string.split(splitRegExp);
        for (String s : array) {
            System.out.println(s);
        }
    }

    public static void formatString() {
        Formatter formatter = new Formatter(System.out);
        formatter.format("%-10s   %5s   %5s", "Name", "Sername", "Title\n");
        formatter.format("%-10s   %5s   %5s", "Ivan", "Ivanov", "enginie\n");
        formatter.format("%-10s   %f", "weight", 50.3f);
    }

    public static void stringMethods() {
        String message = "\nMessage\n";
        String message1 = "\nmeSsAge\n";
        String message2 = "Mes";

        Formatter formatter = new Formatter(System.out);
        //create new string in upper case
        formatter.format("%5s", message.toUpperCase());
        //create new sting in low case
        formatter.format("%5s", message.toLowerCase());
        //equals to string
        formatter.format("%5s", message.equals(message2));
        //equals ignore case
        formatter.format("%5s", message.toUpperCase().equalsIgnoreCase(message1));
        //checks containing inside s1 string s2
        formatter.format("%5s", message.contains(message2));
        System.out.println("#######");
        //replace string "\n" to ""
        formatter.format("%5s", message.replaceAll("\n", "R"));
        System.out.println("#######");
        //join two string
        formatter.format("%5s", message.concat(message2));
        System.out.println("#######");
        formatter.format("%5s", message);

    }

    public static void main(String... args) {
//        final String template = "+38-067-777-77-77";
//        System.out.println(isNumberPhone(template));
//        final String template2 = "++38-067-777-77-77";
//        System.out.println(isNumberPhone(template2));
//        final String template3 = "+38-067-77-77-77";
//        System.out.println(isNumberPhone(template3));
//        stringBulder(TEMPLATE_SEARCH_STRING, SEARCH_ELEMENT);
//
//        splitString(TEMPLATE_SPLIT_STRING, "\\d");
//        System.out.println("########################");
//        splitString(TEMPLATE_SPLIT_STRING, "\\d{3}");
//
//        formatString();
//
//        stringMethods();

//        String s=new String("abcde");
//        s.concat("jt");//   s+jt
//
//
//
        scaner();
//     System.out.println("");
//     String matrixSize =stdin.nextLine();
//     for (int t=0;t<Integer.valueOf(matrixSize);t++) {
//         String s ="index ";
//         String data= inputData();
//         Integer
//     }
    }

    private final static class Counter {

        private int count;

        public Counter(int count) {
            this.count = count;
        }

        public void add() {
            this.count++;
        }

        public int getCount() {
            return count;
        }

        @Override
        public String toString() {
            return "Counter{" +
                   "count=" + count +
                   '}';
        }
    }
}

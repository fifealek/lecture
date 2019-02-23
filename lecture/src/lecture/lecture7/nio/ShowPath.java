package lecture.lecture7.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ShowPath {

    public static void showPath(String uri) {

        Path path = Paths.get(uri);
        System.out.println(path.getFileName());
        System.out.println(path.getFileSystem());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.isAbsolute());
        System.out.println(path.toUri());
        for(Path element:path) {
            System.out.println("element : " +element);
        }

    }

    public static void showPath(String uri,String uri1) {
        Path path = Paths.get(uri);
        Path path1 = Paths.get(uri1);
        System.out.println(path.equals(path1));
        System.out.println(path.compareTo(path1)==0);
    }

    public static void main(String ... args) {
     String uri= "/home/fife/app.log";
     showPath(uri);
     System.out.println("############################");

        showPath(uri,uri);
        showPath(uri,"/home/fife/app1.log");
    }

}

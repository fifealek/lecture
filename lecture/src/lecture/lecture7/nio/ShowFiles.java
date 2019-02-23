package lecture.lecture7.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ShowFiles {

    public static void showFile(String uri, String path) throws IOException {
        boolean b = Files.isSameFile(Paths.get(uri), Paths.get(path));
        System.out.println(b);

        b = Files.exists(Paths.get(uri));
        System.out.println(b);
        System.out.println("size " + Files.size(Paths.get(uri)));
        System.out.println("Owner " + Files.getOwner(Paths.get(uri)));
        System.out.println("isReadable " + Files.isReadable(Paths.get(uri)));
        System.out.println("isExecutable " + Files.isExecutable(Paths.get(uri)));
        System.out.println("isHidden " + Files.isHidden(Paths.get(uri)));
        System.out.println("isWritable " + Files.isWritable(Paths.get(uri)));
        System.out.println("isSymbolicLink " + Files.isSymbolicLink(Paths.get(uri)));
        System.out.println(Files.getAttribute(Paths.get(uri), "lastModifiedTime", LinkOption.NOFOLLOW_LINKS));


    }

    public static void copy(String uri, String path) throws IOException {
      //  if (Files.exists(Paths.get(path))) {
            Files.copy( Paths.get(uri), Paths.get(path),StandardCopyOption.REPLACE_EXISTING);
            Files.delete(Paths.get(path));
        //}
    }

    public static void main(String... args) throws IOException {

        String uri = "/home/fife/app1.log";
        String uri1 = "/home/fife/app1.log";
        showFile(uri, uri1);
        copy(uri, "/home/fife/job/a.log");
    }

}

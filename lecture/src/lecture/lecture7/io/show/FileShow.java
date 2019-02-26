package lecture.lecture7.io.show;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.regex.Pattern;

public class FileShow {

    public void lookForFiles(String dir, FilenameFilter filter) {
        File file = new File(dir);
        String[] files = file.list(filter);
        for (String s : files) {
            System.out.println(s);
        }
    }

    public void print(File file, FilenameFilter filter,int count) {
        File[] files = file.listFiles(filter);
        if (files != null) {
            for (File f : files) {
                if (f != null) {
                    String t="%"+count+"s";
                    String s=String.format(t,f.getAbsolutePath()+"\n");
                    System.out.print(s);
                }
            }
        }
    }

    public void lookForFiles(File file, FilenameFilter filter,int count) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f != null) {
                count++;
                if (f.isDirectory()) {
                    print(f, filter,count);
                    lookForFiles(f, filter,count);
                } else {
                    print(f, filter,count);
                }
               // System.out.println(f.getAbsolutePath());
            }
        }
    }


    private void createDirDeleteDir(String newDir) {
        File file =new File(newDir);

        if(file.exists()) {
            boolean isDeleted = file.delete();
            System.out.println(" isDeleted = "+isDeleted);
        }else {
            boolean isCreatedTreeDirs = file.mkdirs();
            System.out.println("isCreatedTreeDirs = "+isCreatedTreeDirs);
        }

    }

    private void createFile(String filePath) throws IOException {
        File file=new File(filePath);
        if(!file.exists() && file.getParentFile().exists()) {
           boolean isCreatedFile = file.createNewFile();
           System.out.println("isCreatedFile = "+isCreatedFile);
        }else if(file.exists()){
            boolean isDeleteFile = file.delete();
            System.out.println("isDeleteFile = "+isDeleteFile);
        }
    }
    private class SearchFile implements FilenameFilter {

        private Pattern pattern;
        private String reg;

        public SearchFile(final String reg) {
            this.reg = reg;
            pattern = Pattern.compile(reg);
        }

        @Override
        public boolean accept(final File pathname, final String name) {
            return pattern.matcher(name).matches();

        }
    }


    public static void main(String... args) throws IOException {
        String dir = "/home/fife/lectures/lecture/lecture/src/lecture/lecture7/nio";
        FileShow fileShow = new FileShow();
        fileShow.lookForFiles(dir, fileShow.new SearchFile("\\w+.java"));
        dir = "/home/fife/lectures/lecture/lecture/src";
        fileShow.lookForFiles(new File(dir), fileShow.new SearchFile("\\w+.java"),0);

        String newDirs ="/home/fife/lectureM/lecture";
        String newFile = "/home/fife/lectureM/lecture/Main.java";
        fileShow.createDirDeleteDir(newDirs);
        fileShow.createFile(newFile);
    }

}

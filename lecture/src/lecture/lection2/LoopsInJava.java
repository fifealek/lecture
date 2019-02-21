package lecture.lection2;

import static lecture.lection2.Me.print;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LoopsInJava extends Object {

    private static int SEARCHING_ELEMENT = 7;
    private static int BREAK_ELEMENT = 20;
    private static String START_DIR = "/home/fife/db";

    final public void loopfor(final List<Integer> list) {

        System.out.println(" ");
        for (int t : list) {
            System.out.println(t);
        }
    }

    final public void loopfor(final Integer[] arrayInt) {
        System.out.println(" ");
        for (int t = 0; t < arrayInt.length; t++) {
            System.out.println(t);
        }

    }

    final public int loopfor(final List<Integer> list, int searchingElement) {
        System.out.println(" ");
        int count = 0;
        boolean b = true;

        for (; b; ) {
            count++;

            if (count == list.size()) {
                break;
            }

            if (searchingElement == list.get(count)) {
                b = false;
            }


        }

        return count;

    }


    final public int findElement(final List<Integer> list, int searchingElement, int breakElement) {
        System.out.println(" ");
        int count = 0;
        boolean b = true;
        List allelementsdividing20 = new ArrayList(); //
        for (int t = 0; t < list.size(); t++) {

//            if(list.get(t)%20==0) {
//                allelementsdividing20.add(list.get(t));
//               return list.get(t);
//            }

            if (searchingElement == list.get(count)) {
                count++;
                continue;
            } else if (breakElement == list.get(count)) {
                break;
            }

        }

        return count;

    }

    final public void loopWhile(final List list) {
        System.out.println(" ");
        int count = list.size();

        while (count-- == 0) {
            System.out.println(list.get(count));
        }
    }

    final public void loopdoWhile(final List list) {
        System.out.println(" ");
        boolean b = true;
        int size = list.size();
        int count = 0;
        do {
            count++;
            if (size > count) {
                System.out.println(list.get(count));
            } else {
                b = false;
            }

        } while (b);
    }

    final List<Integer> fullList(int arraySize) {
        System.out.println(" ");
        List list = new ArrayList();

        Random r = new Random();

        for (int t = 0; t < arraySize; t++) {
            list.add(r.nextInt(arraySize));
        }

        return list;
    }

    final public Integer[] fullArray(int arraySize) {
        System.out.println(" ");
        List list = new ArrayList();

        Random r = new Random();

        for (int t = 0; t < arraySize; t++) {
            list.add(r.nextInt(arraySize));
        }

        return (Integer[]) list.toArray(new Integer[list.size()]);
    }

    final public void exampleSwitch(EnumService enumService) {
        String s = null;
        switch (enumService) {
            case INNER_SERVICE:
                s = enumService.name();
                break;
            case EXTERNAL_SERVISE:
                s = enumService.name();
                break;
            default:
                s = "";
        }

        System.out.println(s);
    }

    final public void searchDir(File file) {

        if (file != null && file.listFiles() != null) {
            File[] files = file.listFiles();
            for (File f : files) {
                if (f != null && !f.isFile()) {
                       System.out.println(f.getAbsolutePath());
                    searchDir(f);
                }
            }
        }

    }

    final public void logic(int a) {
        if (a == 1) {
            System.out.println("a==1 " + (a == 1));
        }

        if (a <= 1) {
            System.out.println("a==1 " + (a <= 1));
        }

        if (a >= 1) {
            System.out.println("a>=1 " + (a >= 1));
        }

        if (a > 1 && a < 3) {
            System.out.println("a > 1 && a < 3 " + (a));
        }

        if (a == 1 || a < 3) {
            System.out.println("a == 1 || a < 3 " + (a));
        }

        String m1="m";
        String m2="m";

        if (m1.equals(m2)) {
            System.out.println(m1.equals(m2));
        }

        if((a>1 | a>=3) & (a-2>1)) {

        }
        System.out.println(m1.equals(m2));
    }

    //some examples of creating arrays.
    //Array index always starts from 0.

    /**
     *
     */
    public void arrays() {
        int intArray[] = new int[10];
        Object objectArray[] = new Object[5];

        objectArray[0] = new Object();
        objectArray[1] = new String();
        Object o[]=new Object[5];

        //Copes array
        System.arraycopy(objectArray,1,o,1,2);
        String a = null;
//         a="sddfdsfdsdsaf";
//        if(a != null) {
//            a=a.concat("F");
//        }
        //System.out.println(a);
        String[] listStrings = {"a", "b", "asd"};

        long l[] = new long[]{1l, 57777777l, 2l,2l};

        // multidimensional array
        int[][] multiArray = new int[2][2];
        multiArray[0][0] = 1;
        multiArray[0][1] = 2;
        multiArray[1][0] = 3;
        multiArray[1][1] = 4;
        //multiArray[2][2] = 3;
        System.out.println("##############################");

        //How to move through multiArray
        for (int t = 0; t < multiArray.length; t++) {
            for (int x = 0; x < multiArray[t].length; x++) {
                System.out.println(multiArray[t][x]);
            }
        }

        System.out.println("##############################");

        Arrays.sort(l);



        for (long lnumeric : l) {
            System.out.println(lnumeric);
        }

        System.out.println("OOOOOOOOOOOOOOOO");
        int index =Arrays.binarySearch(l,2l);

        System.out.println();
        System.out.println(l[index]);
        System.out.println("OOOOOOOOOOOOOOOO");
        System.out.println(" index in array " + Arrays.binarySearch(l, 2l));
    }


    public static void main(String... args) {
        LoopsInJava loopsInJava = new LoopsInJava();
//        List<Integer> list = loopsInJava.fullList(100);
//
//        Integer[] array = new Integer[list.size()];
//        Integer[] t = list.toArray(array);
//
//        loopsInJava.loopfor(list, SEARCHING_ELEMENT);
//        loopsInJava.loopfor(list);
//
//        loopsInJava.loopfor(t);
//
//        loopsInJava.loopWhile(list);
//        loopsInJava.findElement(list, SEARCHING_ELEMENT, BREAK_ELEMENT);
//
//        loopsInJava.loopdoWhile(list);
//
        File file = new File(START_DIR);
//
        loopsInJava.searchDir(file);

        loopsInJava.arrays();

//        print();
//        int a=5;
//        loopsInJava.logic(a);
//        loopsInJava.logic(2);
//        loopsInJava.logic(1);
//        loopsInJava.logic(3);
    }

}

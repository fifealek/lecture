package lecture.lecture4.declarationclass;

public class ClassBlocks extends Block {
    private ChildSimpleClass childSimpleClass =new ChildSimpleClass(0,"Init ClassBlocks",3);

    private SimpleClass simpleClass;

    private int anInt =add("initialize a anInt value ");

    public ClassBlocks (final SimpleClass simpleClass) {
        System.out.println("This is a ClassBlocks");
        this.simpleClass=simpleClass;
    }

    public ClassBlocks() {
        System.out.println("This is a ClassBlocks");
    }

    public static void main(String ... args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        System.out.println("load class ClassBlocks");
        ClassBlocks classBlocks = new ClassBlocks(null);
        System.out.println("()()()()()()()()()()()");
      //  Class cl = ClassLoader.getSystemClassLoader().loadClass("lecture.lecture4.declarationclass.ClassBlocks");
        //cl.newInstance();


    }

}

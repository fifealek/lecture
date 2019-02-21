package lecture.lecture4.declarationclass;

public class ChildSimpleClass  extends SimpleClass {

    final private int notFree;

    public ChildSimpleClass(final int free, final String description, final int notFree) {
        super(free, description);
        System.out.println("This is a class construction ChildSimpleClass");
        this.notFree = notFree;

    }

    public int getNotFree() {
        return notFree;
    }

    @Override
    public int getFree() {
        return 0;
    }

    //It is not possible to override method getDescription because it is final method.
//    @Override
//    public String getDescription(){}
}

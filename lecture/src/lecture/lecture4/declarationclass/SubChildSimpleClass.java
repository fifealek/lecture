package lecture.lecture4.declarationclass;

public class SubChildSimpleClass extends ChildSimpleClass {

    final private char c;
    public int free = 5;

    public SubChildSimpleClass(final int free, final String description, final int notFree, final char c) {
        super(free, description, notFree);
        this.c = c;
        System.out.println("This is a class construction SubChildSimpleClass");
    }

    public int getFree() {
        System.out.println("invoke method getFree in " + " " + this.getClass());
        return super.getFree();
    }

    public int getFree(int t) {
        return free + t;
    }

    public int getFree(long l) {
        return free + Integer.valueOf(String.valueOf(l));
    }

    public int getFree(String a) {
        return free + Integer.valueOf(a);
    }

}

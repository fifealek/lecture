package lecture.lecture4.declarationclass;


public class SimpleClass {

    final public int free;
    final private String description;

    public SimpleClass(final int free, final String description) {
        System.out.println("This is a class construction SimpleClass");
        this.free = free;
        this.description = description;
    }

    public int getFree() {
        return free;
    }

    final public String getDescription() {
        return description;
    }

}

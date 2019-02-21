package lecture.lecture4.packegesandmodifiers.showpackageaccess;

public class Modifiers {

    private int anInt = 0;
    protected String string = "";

    public String youCanSeeMeAnyWhere = "youCanSeeMeAnyWhere";

    long vT = 0;

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(final int anInt) {
        this.anInt = anInt;
    }

    public String getString() {
        return string;
    }

    public void setString(final String string) {
        this.string = string;
    }
}

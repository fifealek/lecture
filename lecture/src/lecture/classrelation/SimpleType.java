package lecture.classrelation;

public class SimpleType {

    private int parameter;
    public void intType() {
        int t = 0;
        System.out.println(" Int type. Max value " + Integer.MAX_VALUE + " Min value " + Integer.MIN_VALUE);
    }

    public void byteType() {
        byte t = 0;
        System.out.println(" Byte type. Max value " + Byte.MAX_VALUE + " Min value " + Byte.MIN_VALUE);
    }

    public void longType() {
        long l = 0;
        System.out.println(" Long type. Max value " + Long.MAX_VALUE + " Min value " + Long.MIN_VALUE);
    }

    public void shotType() {
        short sh = 0;
        System.out.println(" Short type. Max value " + Short.MAX_VALUE + " Min value " + Short.MIN_VALUE);
    }

    public void BooleanType() {
        boolean b = false;
        System.out.println(" Boolean type has values " + Boolean.TRUE + " false value " + Boolean.FALSE);
    }

    protected void charType() {
        char c = 'a';
        System.out
                .println(" Char type has a lots values " + Character.MAX_VALUE + " false value " + Character.MIN_VALUE);
        StringBuilder stringBuilder = new StringBuilder();
        for (char t = Character.MIN_VALUE; t < Character.MAX_VALUE; t++) {
            stringBuilder.append(" ").append(t);
        }
        System.out.println(stringBuilder.toString());
    }

    public void doubleType() {
        double d = 5d;
        System.out.println(" Double type. Max value " + Double.MAX_VALUE + " Min value " + Double.MIN_VALUE);
    }

    public void floatType() {
        float f = 5f;
        System.out.println(" Float type. Max value " + Float.MAX_VALUE + " Min value " + Float.MIN_VALUE);
    }

    /*
     * Операторы Java
     * присваивание
     * */
    public void assignment() {

        int hieght = 180;
        System.out.println("This is a hieght . " + hieght);
        Realation realation1 = new Realation(1, "first");
        Realation realation2 = new Realation(2, "Second");
        System.out.println("realation1 : " + realation1 + " realation2 : " + realation2);

        //change inner stat of object
        realation1.changeInnerObjectStat("thid", 3);
        System.out.println("realation1 : " + realation1 + " realation2 : " + realation2);

        //assignment realation1=realation2
        realation1 = realation2;
        System.out.println("realation1 : " + realation1 + " realation2 : " + realation2);
        //
        realation2.changeInnerObjectStat("five", 5);
        System.out.println("realation1 : " + realation1 + " realation2 : " + realation2);

        System.out.println("This is a hieght .");

    }

    public void baseOperationInJava() {
        int s = 1 + 3;
        long l = 7 - 8;
        System.out.println("s :" + s + " l : " + l);

        short f= (short) (s * l);

        int ff= (int) (s * l);


        double a = s/l;
        System.out.println("f :" + f + " a : " + a);

        int p = 49;

        System.out.println("Остаток от деления "+p%9);

        int autoincrement=0;
        autoincrement++;
        autoincrement=autoincrement+1;

        System.out.println(autoincrement);
        autoincrement--;
        System.out.println(autoincrement);
        --autoincrement;
        System.out.println(autoincrement);
        --autoincrement;
        System.out.println(autoincrement);

        boolean b= s>l;


        System.out.println("b="+b);

        b=s<l;
        System.out.println("b="+b);

        Integer i1=new Integer(45);

        Integer i2=new Integer(45);

        System.out.println("i1==i2 "+(i1==i2));
        System.out.println("i1!=i2 "+(i1!=i2));
    }

    public static void main(String... args) {
        SimpleType simpleType = new SimpleType();

        simpleType.charType();
        simpleType.intType();
        simpleType.BooleanType();
        simpleType.byteType();
        simpleType.shotType();
        simpleType.longType();
        simpleType.floatType();
        simpleType.doubleType();

        simpleType.assignment();

        simpleType.baseOperationInJava();
    }
}

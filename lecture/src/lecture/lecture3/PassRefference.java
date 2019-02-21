package lecture.lecture3;

public class PassRefference {

    public void  lookAtPassValue(int a, Refference r) {
        a=a+1000;

        r.setA(r.getA()+100);
        r.setS(r.getS()+"As");

    }


    public static void main(String ...args) {
        int valueInt = 20;

        String a= "Av";

        Refference refference = new Refference(valueInt,a);

        PassRefference passRefference = new PassRefference();

        passRefference.lookAtPassValue(valueInt,refference);
        System.out.println("valueInt " + valueInt);
        System.out.println("Refference "+ refference.getS());
        System.out.println("Refference "+ refference.getA());
    }

}

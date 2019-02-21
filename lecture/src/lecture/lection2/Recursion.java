package lecture.lection2;

public class Recursion {

    public int factorial(int t) {
        int result;
        if (t == 1) {
            return 1;
        } else {
            result = factorial(t - 1) * t;
        }
        System.out.println("factorial number : [" + t + "] equals : [" + result + "]");
        return result;
    }


    public long factorial(long l) {
        long result = 1;
        for (long x = 1; x <= l; ++x) {
            result = result * x;
        }
        return result;
    }

    public static void main(String... args) {
       String nF="5";

        Recursion recursion = new Recursion();
        recursion.factorial(Integer.valueOf(nF));

        System.out.println("factorial number billing in loop: "+3l +"  = "+recursion.factorial(Long.valueOf(nF)));
    }

}

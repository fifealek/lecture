package lecture.lecture9.showthread;

public class SimpleSecond extends Thread {

    public SimpleSecond() {
        System.out.println("Second thread");
        start();
        work();
    }

    public void work(){
        for(int t=0;t<10;t++){
            System.out.println(t);
        }
    }
}

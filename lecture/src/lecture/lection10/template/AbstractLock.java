package lecture.lection10.template;

public abstract class  AbstractLock {
     abstract void lock();
     abstract void connect();
     abstract void open();

     public void action() {
         open();
         connect();
         lock();
     }

}

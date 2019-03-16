package lecture.lection10.template;

public class Entry1 extends AbstractLock {

    @Override
    void lock() {
        System.out.println("lock door");
    }

    @Override
    void connect() {
      System.out.println("connect door");
    }

    @Override
    void open() {
      System.out.println("open door");
    }

    public static void main(String ... args){
        Entry1 entry1 = new Entry1();
        entry1.action();
    }
}

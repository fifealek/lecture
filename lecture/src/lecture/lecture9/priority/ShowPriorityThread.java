package lecture.lecture9.priority;

public class ShowPriorityThread implements Runnable {
private final int priority;

    public ShowPriorityThread(final int priority) {
        this.priority = priority;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        while (!Thread.interrupted()){
            System.out.println("name "+Thread.currentThread().getName()+ " priority "+Thread.currentThread().getPriority());
        }
    }
}

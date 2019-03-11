package lecture.lection10.iterator;

import lecture.lection10.decorator.MainRun;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ShowIterator {
    private <T> void showWorkWithInterator(Collection<T> collection) {
        Iterator it =collection.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private <T> void showWorkWithInteratorRemove(Collection<T> collection) {
        Iterator it =collection.iterator();
        while(it.hasNext()) {
            Object o =it.next();
            System.out.println(o);
            it.remove();
        }
    }

    public static void main(String ... str) {
        List arrayList = new ArrayList();
        arrayList.add(MainRun.getFixedType());
        arrayList.add(MainRun.getFixedType());

        ShowIterator showIterator = new ShowIterator();
        showIterator.showWorkWithInterator(arrayList);

        List linkedList = new LinkedList();
        arrayList.add(MainRun.getFixedType());
        arrayList.add(MainRun.getFixedType());
        showIterator.showWorkWithInterator(arrayList);
        showIterator.showWorkWithInteratorRemove(arrayList);
    }
}

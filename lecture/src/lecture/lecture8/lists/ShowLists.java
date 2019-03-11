package lecture.lecture8.lists;

import lecture.lection10.decorator.Fixed;
import lecture.lection10.decorator.MainRun;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ShowLists {

    public void showArrayList() {
        List<Fixed> list = new ArrayList();
        list.add(MainRun.getFixedType());
        list.add(MainRun.getFixedType());
        System.out.println("list.size() : " + list.size());
        System.out.println(list.get(1));
        boolean isRemove = list.remove(list.get(1));
        System.out.println("isRemove : " + isRemove);

        System.out.println("list.size() : " + list.size());
        List<Fixed> list1 = new ArrayList(list);
        list1.addAll(list);
        System.out.println(" list1.size() : " + list1.size());
        list1.removeAll(list);
        System.out.println(" list1.size() : " + list1.size());
    }

    public void showLinkedList() {
        LinkedList<A> list = new LinkedList();
        list.add(new A(1));
        list.add(new A(2));
        list.add(new A(3));
        ListIterator lit = list.listIterator();

        while (lit.hasNext()) {
            System.out.println(lit.next());
        }

        System.out.println("list.size() : " + list.size());
        lit = list.listIterator(list.size());
        //System.out.println("list.size() : " + lit.);

        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }
    }

    public static void main(String... args) {
        ShowLists showLists = new ShowLists();
        showLists.showArrayList();

        showLists.showLinkedList();
    }

    private class A {
        private int index;

        public A(int index) {
            this.index = index;
        }

        public int getIndex() {
            return index;
        }

        @Override
        public String toString() {
            return "A{" +
                    "index=" + index +
                    '}';
        }
    }
}

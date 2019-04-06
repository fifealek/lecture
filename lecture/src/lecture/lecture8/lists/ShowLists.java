package lecture.lecture8.lists;

import static lecture.lecture8.set.ShowSet.getCollection;

import lecture.lection10.decorator.Fixed;
import lecture.lection10.decorator.MainRun;
import lecture.lecture8.Sets;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ShowLists {

    public void showArrayList() {
        List<Fixed> list = new ArrayList();
        //List list = new ArrayList()
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

    public void showQueue() {
        ArrayDeque<Sets> ad = new ArrayDeque<>(getCollection());
        Sets s1 = new Sets(3, "Alo");
        Sets s2 = new Sets(5, "Oly");
        ad.offerFirst(s1);
        ad.offerLast(s2);
        System.out.println(ad);
        ad.addFirst(s2);
        ad.addLast(s1);
        System.out.println(ad);
        ad.removeAll(getCollection());
        System.out.println(ad);
        ad.remove(s1);
        System.out.println(ad);

        System.out.println(ad.size());
        int counts = ad.size();
  // Do not use this structure for ArrayDeque
//        for (int t = 0; t < ad.size(); ++t) {
//            System.out.println(ad.pollFirst());
//        }
        ArrayDeque<Sets> ad1= new ArrayDeque<>(ad);
        for (int t = 0; t < counts; ++t) {
            System.out.println(ad.pollFirst());
        }

        System.out.println("#################");
        for (int t = 0; t < counts; ++t) {
            System.out.println(ad1.pollLast());
        }

//        for (int t=0;t<10;t++){
//            System.out.println(ad.poll());
//        }
//
//        System.out.println(ad.size());
//        System.out.println(ad);
    }

    public static void main(String... args) {
       ShowLists showLists = new ShowLists();
        showLists.showArrayList();

        showLists.showLinkedList();
        showLists.showQueue();

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

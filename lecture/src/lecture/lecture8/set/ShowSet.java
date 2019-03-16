package lecture.lecture8.set;

import lecture.lecture8.Sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ShowSet {

    public List<Sets> getCollection() {
        Sets sets = new Sets(100, "Olex");
        Sets sets1 = new Sets(21, "Alex");
        Sets sets2 = new Sets(33, "Viktor");
        List list = new ArrayList();
        list.add(sets);
        list.add(sets1);
        list.add(sets2);
        return list;
    }

    public void showHashSet() {
        Set s = new HashSet(128, 0.75f);
        s.addAll(getCollection());
        showCollection(s);
    }

    public void showHashSet1() {
        Set s = new HashSet();
        s.addAll(getCollection());
        separate();
        boolean b = s.add(new Sets(100, "Olex"));
        System.out.println("boolean " + b);
        showCollection(s);
    }

    public void showCollection(Collection s) {
        separate();
        Iterator it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    static Comparator<Sets> getComparableOrderInt() {
        return new Comparator<Sets>() {
            @Override
            public int compare(Sets o1, Sets o2) {
                return o1.getAge() - o2.getAge();
            }
        };
    }


    static Comparator<Sets> getComparableOrderString() {
        return new Comparator<Sets>() {
            @Override
            public int compare(Sets o1, Sets o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
    }

    public void showTreeSet() {
        SortedSet sortedSet = new TreeSet(getComparableOrderInt());
        sortedSet.addAll(getCollection());
        showCollection(sortedSet);

        sortedSet = new TreeSet(getComparableOrderString());
        sortedSet.addAll(getCollection());
        showCollection(sortedSet);

    }

    public void sort() {
        List list = getCollection();
        Sets[] set = (Sets[]) list.toArray(new Sets[list.size()]);
        Arrays.sort(set, getComparableOrderInt());
        showCollection(Arrays.asList(set));
        Arrays.sort(set, getComparableOrderString());
        showCollection(Arrays.asList(set));
    }

    public void separate() {
        System.out.println("#####################");
    }

    public void showPriorityQueue() {
        PriorityQueue<Sets> priorityQueue = new PriorityQueue<Sets>(getComparableOrderInt());
        priorityQueue.addAll(getCollection());
        showCollection(priorityQueue);
    }

    public static void main(String... args) {
        ShowSet set = new ShowSet();
        set.showHashSet();
        set.showTreeSet();
        set.sort();
        set.showHashSet1();
        set.showPriorityQueue();
    }

}

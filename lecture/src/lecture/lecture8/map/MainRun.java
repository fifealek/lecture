package lecture.lecture8.map;

import com.sun.org.apache.xerces.internal.xs.ShortList;
import lecture.lecture8.Sets;
import lecture.lecture8.set.ShowSet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainRun {

    private static Integer KEY = 33;
    public static void showMap() {
        List<Sets> setsList = ShowSet.getCollection();
        Sets sets1 = new Sets(21, "Diana");
        Map<Integer, Sets> mapSets = new HashMap<>();
        for (Sets s : setsList) {
            mapSets.put(s.getAge(), s);
        }
        System.out.println(mapSets);
        Sets s = mapSets.put(sets1.getAge(), sets1);
        System.out.println(mapSets);
        System.out.println(s);


        System.out.println("before remove "+mapSets);
        mapSets.remove(100);
        System.out.println("after remove "+mapSets);
        System.out.println("Shows a object with key 33 "+mapSets.get(KEY));

        for(Map.Entry<Integer,Sets> me:mapSets.entrySet()){
            Integer key = me.getKey();
            Sets value = me.getValue();
            System.out.println("key = " +key +"; value = "+value );
        }






    }

    public static void main(String... args) {
      showMap();
    }
}

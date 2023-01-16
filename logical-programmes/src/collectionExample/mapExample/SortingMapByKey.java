package collectionExample.mapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class SortingMapByKey {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(23,"shivam");
        hm.put(17,"amit");
        hm.put(15, "aditya");
        hm.put(9, "ranjit");

       Iterator<Integer> itr = hm.keySet().iterator();
        System.out.println("before sorting");
       while (itr.hasNext()) {
           int key = itr.next();
           System.out.println("Id: "+key+" Name: "+hm.get(key));
       }

        System.out.println("\n");

        System.out.println("After sorting");
        TreeMap<Integer, String> tm = new TreeMap<>(hm);
        Iterator<Integer> it = tm.keySet().iterator();
        while (it.hasNext()) {
            int key = it.next();
            System.out.println("Id: "+key+" Name : "+tm.get(key));
        }

    }
}

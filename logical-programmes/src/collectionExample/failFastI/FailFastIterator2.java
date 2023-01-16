package collectionExample.failFastI;//importing classes

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
import java.util.ArrayList;


//creating FailFastIterator2.java class
public class FailFastIterator2 {

    //main() method starts
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("shivam");
        list.add("surendra");
        list.add("amit");
        list.add("aditya");

     Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("aditya")) {
                list.add("amit");
            }
        }

//
//       Iterator<String> iterator2 = list.iterator();
//        while (iterator2.hasNext()) {
//            if (iterator2.next().equals("amit")) {
//                list.remove("amit");
//            }
//        }
        System.out.println(list);
    }
}

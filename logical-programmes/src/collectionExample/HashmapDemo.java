package collectionExample;

import java.util.*;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new LinkedHashMap<>();
        hashMap.put(1,"java");
        hashMap.put(2,"c++");
        hashMap.put(5,"dart");


        System.out.println("by using for ");
        for (Map.Entry<Integer, String> m: hashMap.entrySet()) {
            System.out.println(m.getKey()+" "+ m.getValue());
        }

        System.out.println("By using iterator");
        Iterator<Integer> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            int key = iterator.next();
            System.out.println("id : "+key+",value : "+hashMap.get(key));
      }

        System.out.println("by using forEach Methode");
       hashMap.forEach((k,v)-> System.out.println("id : "+k+" ,value : "+v));

            
        }
        
    }


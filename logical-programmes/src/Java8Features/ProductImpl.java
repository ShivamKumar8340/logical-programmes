package Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductImpl {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"mobile",29000));
        list.add(new Product(2,"laptop",23000));
        list.add(new Product(3,"desktop",22000));
        list.add(new Product(4,"tab",20000));

       /* List<Integer> prices = list.stream()
                .filter(product -> product.price>20000)
                .map(product -> product.price)
                .collect(Collectors.toList());

        System.out.println(prices);*/


        // more compact way
        list.stream().filter(product -> product.name.endsWith("p"))
                .forEach(p-> System.out.println(p.id+" "+ p.name+" "+p.price));
    }
}

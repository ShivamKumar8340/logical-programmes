import java.util.*;
import java.util.stream.Stream;
class ProductfilterData {
	public static void main(String args[]) {
		List<Product> list = new ArrayList();
		list.add(new Product("mobile",9000,"colour"));
		list.add(new Product("laptop",10000,"red"));
		list.add(new Product("tab",11000,"greenn"));
		list.add(new Product("headphone",2000,"grey"));
		list.add(new Product("bluetooth",11000,"black"));
		list.add(new Product("earbuds",5000,"white"));
		list.add(new Product("fridge",20000,"grey"));

	

		Stream<Product> filteredData = list.stream().filter(p->p.price>5000);

		filteredData.forEach(product->System.out.println(product.name+" "+product.price+" "+product.colour));




	}
}
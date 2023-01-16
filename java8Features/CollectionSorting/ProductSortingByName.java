import java.util.*;
class ProductSortingByName{
	public static void main(String args[]) {

	List<Product> list = new ArrayList<Product>();

	list.add(new Product("mobile",5000,"Red"));
	list.add(new Product("laptop",10000,"Black"));
	list.add(new Product("tablet",8000,"Green"));

	Collections.sort(list,(p1,p2)->{
		if(p1.price==p2.price) {
			return 0;
		}else if(p1.price>p2.price){
			return 1;
		}else
			return -1;
	
	});
			for(Product p: list) {
				System.out.println(p.name+" "+p.price+" "+p.colour);
			}	
	
	}
}
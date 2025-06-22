import java.util.Arrays;
import java.util.Comparator;

public class ProductSearch {

    public static Product linearSearch(Product[] products, int targetId) {
        for(Product p : products) {
            if(p.getProductID()==targetId) {
                return p;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, int targetId) {
        int start = 0;
        int end = products.length - 1;
        while(start <= end) {
            int mid=start + (end - start)/2;
            if(products[mid].getProductID()==targetId) {
                return products[mid];
            }
            if(products[mid].getProductID()>targetId) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return null;
    }
    public static void sort(Product[] products) {
        Arrays.sort(products, Comparator.comparingInt(p -> p.getProductID()));
    }
    public static void main(String[] args) {
        Product[] products = {
                new Product(1,"Table","Furniture"),
                new Product(4,"Think Again","Book"),
                new Product(2,"Shirt","Clothes"),
                new Product(3,"Earphones","Electronics")
        };
        //First trying Linear Search
        Product p1 = linearSearch(products, 3);
        System.out.println(p1 != null ? p1 : "Product not found");

        //Now trying Binary Search
        sort(products);
        Product p2 = binarySearch(products, 4);
        System.out.println(p2 != null ? p2 : "Product not found");
    }
}

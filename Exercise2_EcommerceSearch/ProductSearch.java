import java.util.Arrays;

public class ProductSearch {
    
    
    static Product linearSearch(Product[] products, String searchName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].name.equalsIgnoreCase(searchName)) {
                return products[i];
            }
        }
        return null;
    }
    
    
    static Product binarySearch(Product[] products, String searchName) {
        int start = 0;
        int end = products.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            int result = products[mid].name.compareToIgnoreCase(searchName);
            
            if (result == 0) {
                return products[mid];
            } else if (result < 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        
        Product[] products = {
            new Product(1, "Laptop", 55000),
            new Product(2, "Mobile", 15000),
            new Product(3, "Tablet", 25000),
            new Product(4, "Headphones", 3000),
            new Product(5, "Charger", 800)
        };
        
        
        System.out.println("--- Linear Search ---");
        Product found1 = linearSearch(products, "Mobile");
        System.out.println(found1 != null ? "Found: " + found1 : "Product not found");
        
    
        Arrays.sort(products, (a, b) -> a.name.compareToIgnoreCase(b.name));
        
        System.out.println("\n--- Binary Search ---");
        Product found2 = binarySearch(products, "Tablet");
        System.out.println(found2 != null ? "Found: " + found2 : "Product not found");
    }
}
import java.util.*;
    class ProductList{

        String name;
        float price;
        ProductList( String name, float price) {

            this.name = name;
            this.price = price;
        }
    }
    public class Stream2 {
        public static void main(String[] args) {
            List<ProductList> productsList = new ArrayList<ProductList>();
            productsList.add(new ProductList("HP Laptop",25000f));
            productsList.add(new ProductList("Dell Laptop",30000f));
            productsList.add(new ProductList("Lenovo Laptop",28000f));
            productsList.add(new ProductList("Sony Laptop",28000f));
            productsList.add(new ProductList("Apple Laptop",90000f));

            ProductList productMax = productsList.stream().max((product1, product2)->product1.price > product2.price ? 1: -1).get();
            System.out.println(productMax.name +" is costliest laptop");

            ProductList productMin= productsList.stream().min((product1, product2)->product1.price > product2.price ? 1: -1).get();
            System.out.println(productMin.name+" is cheaper laptop");

        }
    }


import java.util.*;

public class LinkedHashMap1 {
    public static void main(String[]args) {
        LinkedHashMap<Integer, String> fruits = new LinkedHashMap<>();
        fruits.put(13, "Apple");
        fruits.put(10, "Banana");
        fruits.put(5, "Mango");
        fruits.putIfAbsent(6, "Orange");
        System.out.println("Fruits name:" + fruits);
        System.out.println("Fruits name in entry set:" + fruits.entrySet());
        System.out.println("get the fruit name in key 6:" + fruits.get(6));
        System.out.println("is Fruits name contains Apple? :" + fruits.containsValue("Apple"));
        fruits.replace(5,"Papaya");
        System.out.println("after rePlacing:"+fruits);
        }
}


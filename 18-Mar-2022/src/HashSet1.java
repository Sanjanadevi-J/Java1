import java.util.*;

public class HashSet1 {
    public static void main(String[]args){
        HashSet<String> fruits=new HashSet<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("custard");
        fruits.add("dates");
        fruits.add("apple");
        System.out.println("Initial list"+fruits);
        System.out.println("cloned list"+fruits.clone());
        System.out.println(fruits.contains("custard"));
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.size());
        Spliterator<String> listOfFruit = fruits.spliterator();
        Spliterator<String> list = listOfFruit .trySplit();
        listOfFruit .forEachRemaining(System.out::println);
        System.out.println("----Splitting fruits list----");
        list.forEachRemaining(System.out::println);
    }
}

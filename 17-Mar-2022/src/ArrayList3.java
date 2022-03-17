import java.util.*;
public class ArrayList3 {
    public static void main(String[]args){
        ArrayList<String> animal = new ArrayList<String>();
        animal.add("dog");
        animal.add("cow");
        animal.add("cat");
        animal.add("goat");
        animal.add("ape");
        animal.add("zebra");
        animal.add("lion");
        System.out.println("Unsorted animal "+animal);
        Collections.sort(animal);
        System.out.println("Sorted animal "+animal);
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(11);
        number.add(1);
        number.add(77);
        number.add(23);
        number.add(56);
        System.out.println("Unsorted number "+number);
        Collections.sort(number);
        System.out.println("Sorted number "+number);

    }
}

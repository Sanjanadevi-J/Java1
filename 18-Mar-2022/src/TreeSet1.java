import java.util.*;

public class TreeSet1 {
    public static void main(String[]args){
        TreeSet<Float> number = new TreeSet<Float>();
        number.add(3.19f);
        number.add(5.42f);
        number.add(1.11f);
        number.add(3.19f);
        number.add(11.5f);
        System.out.println("numbers at initial"+number);
        System.out.println("printing nearest greater number of 5:"+number.ceiling(5f));
        System.out.println("printing nearest smaller number of 5:"+number.floor(5f));
        Iterator ite= number.descendingIterator();
        System.out.println("descending order:");
        while(ite.hasNext()){
            System.out.println( ite.next());
        }
        System.out.println("reverse order:"+number.descendingSet());
        System.out.println("group of smaller number for 5: "+number.headSet(5f));
        System.out.println("elements between 2 and 6: "+number.subSet(2f,6f));
        System.out.println("closest higher number for 6: "+number.higher(6f));
        System.out.println("closest smaller number for 3: "+number.lower(3f));
        System.out.println("elements from 3: "+number.tailSet(3f));
        System.out.println("first element: "+number.first());
        System.out.println("last element : "+number.last());
        System.out.println("size of TreeSet: "+number.size());

    }
}

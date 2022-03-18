import java.util.*;

public class List2 {
    public static void main(String[]args){
        List<Integer> numbers = new LinkedList<Integer>();
        numbers.add(34);
        numbers.add(27);
        numbers.add(99);
        numbers.add(105);
        Collections.sort(numbers);
        ListIterator<Integer> number=numbers.listIterator();
        System.out.println("numbers in forward direction");
        while(number.hasNext()){
            System.out.println("index:"+ number.nextIndex()+",number:"+number.next());
        }
        System.out.println("numbers in backward direction");
        while(number.hasPrevious()){
            System.out.println("index:"+ number.previousIndex()+",number:"+number.previous());
        }
    }
}

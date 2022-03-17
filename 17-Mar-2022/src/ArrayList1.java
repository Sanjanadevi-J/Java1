import java.util.*;
public class ArrayList1 {
    public static void main(String[]args){
        ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();
        listOfIntegers.add(10);
        listOfIntegers.add(15);
        listOfIntegers.add(20);
        listOfIntegers.add(25);
        System.out.println(listOfIntegers);
        Iterator number=listOfIntegers.iterator();
        while(number.hasNext()){
            System.out.println(number.next());
        }

    }
}

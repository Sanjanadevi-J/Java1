import java.util.*;
public class HashMap1 {
    public static void main(String[]args){
        HashMap<Integer,String> list = new HashMap<Integer,String>();
        list.put(1,"Rajan");
        list.putIfAbsent(2,"Rahu");
        list.put(3,"Vishal");
        list.put(1,"Arjun");
        list.put(7,"Ram");
        list.put(15,"Ravi");
        list.put(6,"Dev");
        System.out.println("initial list:"+list);
        System.out.println("Entry list:"+list.entrySet());
        list.putIfAbsent(2,"Vikram");
        list.putIfAbsent(4,"Kumar");
        System.out.println("Updated Entry list:"+list.entrySet());
        list.remove(1);
        list.remove(2,"Rahu");
        System.out.println("After remove Entry list:"+list.entrySet());
        list.replace(3,"Suriyan");
        System.out.println("After replacing Entry list:"+list.entrySet());
        HashMap<Integer,String> list1 = new HashMap<>();
        list1.putAll(list);
        System.out.println("checking equality:"+list1.equals(list));
        System.out.println("creating copy:"+list1.clone());

    }
}

import java.util.*;
public class NestedMap {
    public static void main(String[]args){
        HashMap<Integer, HashMap<Integer,String>> lists = new HashMap<Integer,HashMap<Integer,String>>();
        HashMap<Integer,String>  name1= new HashMap<Integer,String>();
        HashMap<Integer,String>  name2= new HashMap<Integer,String>();
        name1.put(100,"Raj");
        name1.put(102,"John");
        name2.put(201,"Amir");
        name2.put(202,"James");
        lists.put(101, name1);
        lists.put(105,name2);
        System.out.println(lists);
        System.out.println(lists.entrySet());
        System.out.println("Size of list(outer) map is:"+lists.size());
        System.out.println("Size of name(inner) map is:"+name1.size());
        System.out.println(name1.getClass());

}
}

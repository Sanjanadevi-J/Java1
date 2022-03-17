import java.util.*;

public class ArrayList4 {
    public static void main(String[]args){
        ArrayList<String> names=new ArrayList<String>();
        names.add("John");
        names.add("Ravi");
        names.add("Arun");
        names.add(1,"Thomas");
        System.out.println("before adding method"+names);
        System.out.println("size of list is "+names.size());
        ArrayList<String> names2 = new ArrayList<String>();
        names2.add("Kiran");
        names2.addAll(1,names);
        System.out.println("After adding method"+names2);
        names2.remove("John");
        names2.remove(0);
        System.out.println("After remove method"+names2);
        names2.removeAll(names);
        System.out.println("After remove all method"+names2);
    }
}

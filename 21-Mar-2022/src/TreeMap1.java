import java.util.*;
public class TreeMap1 {
    public static void main(String[]args){
        TreeMap<Integer,String> studentList = new TreeMap<>();
        studentList.put(100,"Amit");
        studentList.put(105,"Ravi");
        studentList.put(101,"Vijay");
        studentList.put(103,"Rahul");
        System.out.println("student list:"+studentList);
        System.out.println("student list in entrySet:"+studentList.entrySet());
        System.out.println("using ceiling in student list:"+studentList.ceilingEntry(104));
        System.out.println("using floor in student list:"+studentList.floorKey(107));
        System.out.println("student list in descending order keys :"+studentList.descendingKeySet());
        System.out.println("student list in descending order entries:"+studentList.descendingMap());
        System.out.println("using headMap in student list :"+studentList.headMap(105,false));
        System.out.println("subMap of student list :"+studentList.subMap(100,false,107,true));
        System.out.println("tail map of student list :"+studentList.tailMap(103,true));
        TreeMap<Integer,String> studentList1 = new TreeMap<>(studentList);
        System.out.println("student list in descending order:"+studentList1.comparator());
    }
}

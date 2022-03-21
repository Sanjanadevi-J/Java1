import java.util.*;


import static java.util.Map.*;

public class Map1 {
    public static void main(String[]args){
        Map<Integer,String> names = new HashMap<Integer,String>();
        names.put(500,"Amir");
        names.put(505,"Krish");
        names.put(502,"Ronald");
        names.put(500,"Amir");
        System.out.println(names);
        for(Entry name: names.entrySet()){
            System.out.println(name.getKey()+" "+name.getValue());
        }
        System.out.println("Size of map is:"+names.size());
        System.out.println("names contains 300?:"+names.containsKey(300));
        System.out.println("names contains Amir?:"+names.containsValue("Amir"));
        System.out.println("Entry set is:"+names.entrySet());
        System.out.println(names.values());
        System.out.println(names.keySet());
        System.out.println(names.hashCode());

    }
}

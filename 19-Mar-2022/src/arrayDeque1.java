import java.util.*;

public class arrayDeque1 {
    public static void main(String[]args){
        Deque<String> mobiles =new ArrayDeque<>();
        mobiles.add("Nokia");
        mobiles.offer("Samsung");
        mobiles.offerFirst("Iphone");
        mobiles.add("Motorola");
        mobiles.offerLast("Xiaomi");
        System.out.println("mobiles list:"+mobiles);
        mobiles.pollLast();
        System.out.println("mobiles list after removing last:"+mobiles);
    }
}

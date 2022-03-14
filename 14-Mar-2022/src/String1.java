import java.lang.*;
public class String1 {
    public static void main(String[]args){
        StringBuilder s = new StringBuilder("Happy ");
        System.out.println(s.append("World"));
        System.out.println(s.insert(0,"Have "));
        System.out.println(s.reverse());
        System.out.println(s.reverse());
        System.out.println(s.delete(1,4));
        System.out.println(s.replace(0,3,"Hello H"));
        System.out.println(s.substring(5));
        System.out.println(s.subSequence(4,9));



    }
}

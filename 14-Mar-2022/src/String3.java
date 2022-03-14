import java.util.Scanner;
import java.lang.*;
public class String3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Original string:"+s);
        System.out.println(s.codePointAt(3));
    }
}

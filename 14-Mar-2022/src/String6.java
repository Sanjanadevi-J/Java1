import java.util.Scanner;
import java.lang.*;
public class String6 {
    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        String s1 = sc1.nextLine();
        Scanner sc2 = new Scanner(System.in);
        String s2 = sc2.nextLine();
        StringBuffer str = new StringBuffer(s1);
        System.out.println(s1.contentEquals(str));
        System.out.println(s2.contentEquals(str));
    }
}
import java.util.Scanner;
import java.lang.*;
public class String4 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String s1 = sc1.nextLine();
        Scanner sc2 = new Scanner(System.in);
        String s2 = sc2.nextLine();
       int a= s1.compareTo(s2);
        if(a>0)
            System.out.println("String 1 is greater than String2");
        else if(a<0)
            System.out.println("String1 is smaller than String2");
        else
            System.out.println("String1 is equal to String2");

    }
}

import java.util.*;
public class FindingUpperCase {
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      System.out.println("String is:"+s);
      int upper = 0;
      char[] ch = new char[s.length()];
      for(int i=0;i<s.length();i++) {
          ch[i] = s.charAt(i);
      }
      for(char t : ch){
          System.out.print(t+" ");
      }
      try {
          for (char t : ch) {
              if (t >= 'A' && t <= 'Z') {
                  upper++;
              }
          }
          System.out.println("\nCount of upper case:" + upper);
      }
      catch(Exception e){
          System.out.println(e);
      }
      }
}

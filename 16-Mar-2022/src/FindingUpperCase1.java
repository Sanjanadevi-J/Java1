import java.util.Scanner;
public class FindingUpperCase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("String is:" + s);
        char[] ch = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        for (char t : ch) {
            System.out.print(t + " ");
        }
        try {
            System.out.print("\nUpper case:");
            for (char t : ch) {
                if (t >= 'A' && t <= 'Z') {
                    System.out.print(t + " ");
                }
            }
            System.out.println("\b");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

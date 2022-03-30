import java.util.Scanner;

public class PalindromeUsingRecursion {
    public static void main(String[]args){

        Scanner userInput = new Scanner(System.in);
         int numberToCheckPalindrome = userInput.nextInt();
        int results=recursion(numberToCheckPalindrome,0);
        if(results== numberToCheckPalindrome){
            System.out.println("User input is palindrome");
        }
        else{
            System.out.println("User input is not a palindrome");
        }
    }
    static int recursion(int numberToCheckPalindrome,int results){
        if(numberToCheckPalindrome==0){
            return results;
        }
        else {
            int remainder=numberToCheckPalindrome%10;
            results=results*10+remainder;
            return recursion(numberToCheckPalindrome/10,results);

        }

    }
}

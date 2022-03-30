import java.util.Scanner;

public class PalindromeStringUsingRecursion {
    public static void main(String[]args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the string to find palindrome:");
        String inputToCheckPalindrome= userInput.nextLine();
        if(recursion(inputToCheckPalindrome)){
            System.out.println("User input is palindrome");
        }
        else{
            System.out.println("User input is not a palindrome");
        }
    }
    static boolean recursion(String inputToCheckPalindrome){
        if(inputToCheckPalindrome.length()==0 || inputToCheckPalindrome.length()==1)
            return true;
        if (inputToCheckPalindrome.charAt(0) == inputToCheckPalindrome.charAt(inputToCheckPalindrome.length()-1))
                return recursion(inputToCheckPalindrome.substring(1,inputToCheckPalindrome.length()-1));
            return false;

        }


}

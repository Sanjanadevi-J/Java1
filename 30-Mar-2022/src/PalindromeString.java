import java.util.Scanner;

public class PalindromeString {
    public static void main(String[]args){
        String reversedString =" ";
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the input to check Palindrome:");
        String inputForPalindrome= userInput.nextLine();
        for(int startingIndex=0;startingIndex<inputForPalindrome.length();startingIndex++){
            reversedString =reversedString+inputForPalindrome.charAt(startingIndex);
        }
        System.out.println("Reversed string:"+reversedString);
        if(reversedString.equals(inputForPalindrome)){
            System.out.println("User input string is palindrome");
        }
        else{
            System.out.println("User input string is not palindrome");
        }
    }
}

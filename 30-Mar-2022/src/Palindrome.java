import java.util.Scanner;

public class Palindrome {
    public static void main(String[]args){
        int reversedNumber=0;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number to check palindrome:");
        int numberToCheckPalindrome = userInput.nextInt();
        int DuplicateNumberToCheckPalindrome =numberToCheckPalindrome;
        while(DuplicateNumberToCheckPalindrome!=0) {
            int remainderOfTheNumber = DuplicateNumberToCheckPalindrome % 10;
            reversedNumber = reversedNumber * 10 + remainderOfTheNumber;
            DuplicateNumberToCheckPalindrome = DuplicateNumberToCheckPalindrome / 10;
        }
        System.out.println(reversedNumber);
            if(reversedNumber==numberToCheckPalindrome ){
                System.out.println("The User input number is palindrome");
        }
            else{
                System.out.println("User input number is not a palindrome number");
            }


        }
    }



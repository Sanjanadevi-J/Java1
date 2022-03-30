import java.util.Arrays;
import java.util.Scanner;

public class PalindromeArray {
    void checkingPalindrome(int arrayLength, int[] arrayToCheckPalindrome) {
        int checking=0;
        System.out.print("The elements in array:" + Arrays.toString(arrayToCheckPalindrome));
        for (int Index = 0; Index < arrayLength / 2; Index++) {
            if (arrayToCheckPalindrome[Index] == arrayToCheckPalindrome[arrayLength - Index - 1]) {
                checking=1;
            } else {
               checking=0;
            }
        }
        if(checking==0) {
            System.out.println("\nUser input is Palindrome");
        }
            else{
                System.out.println("\nUser input is not a Palindrome");
            }
    }
    public static void main(String[]args){
        Scanner userInput=new Scanner(System.in);
        System.out.print("Enter the Size to create an array:");
        int arrayLength = userInput.nextInt();
        System.out.println("Enter the elements to enter into the array");
        int[] arrayToCheckPalindrome = new int[arrayLength];
        for (int startingIndex = 0; startingIndex < arrayLength; startingIndex++) {
            int arrayElements = userInput.nextInt();
            arrayToCheckPalindrome[startingIndex] = arrayElements;
        }
        PalindromeArray palindromeArray =new PalindromeArray();
        palindromeArray.checkingPalindrome(arrayLength,arrayToCheckPalindrome);

    }

}

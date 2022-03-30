import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeArrayList {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array list:");
        int listSize= input.nextInt();
        ArrayList<Integer> givenArrayList=new ArrayList<>();
        System.out.println("Enter the elements to enter to the list:");
        for(int index=0;index<listSize;index++){
            int arrayElements=input.nextInt();
            givenArrayList.add(arrayElements);
        }
        System.out.println(givenArrayList);
        ArrayList<Integer> reversedGivenArrayList=new ArrayList<>();
        for(int index=listSize-1;index>0;index--){
            reversedGivenArrayList.add(givenArrayList.get(index));
        }
        if(givenArrayList.equals(reversedGivenArrayList)){
            System.out.println("User array list is palindrome");
        }
        else{
            System.out.println("User array list is palindrome");
        }
    }
}

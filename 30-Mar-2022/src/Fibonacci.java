import java.util.Scanner;

public class Fibonacci {
    public static void main(String[]args){
        int sumOfUserInput=0;
        Scanner userInput=new Scanner(System.in);
        System.out.print("Enter the number to find Fibonacci series:");
        int numberForFibonacci= userInput.nextInt();
        System.out.println("Fibonacci series is:");
        for(int startingNumber=0;startingNumber<numberForFibonacci;startingNumber++){
            sumOfUserInput=sumOfUserInput+startingNumber;
            System.out.print(sumOfUserInput+" ");
        }
        System.out.println("\nFibonacci series is:"+sumOfUserInput);
    }
}

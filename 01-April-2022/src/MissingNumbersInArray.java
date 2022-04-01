import java.util.Arrays;
import java.util.Scanner;

public class MissingNumbersInArray {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int arrayLength=input.nextInt();
        int[] numbersInArray=new int[arrayLength];
        System.out.println("Enter the array elements");
        for(int index=0;index<arrayLength;index++){
            numbersInArray[index]= input.nextInt();
        }
        System.out.println("Array elements are:"+ Arrays.toString(numbersInArray));
        System.out.println(missingNumbers(numbersInArray));
    }
    public static  int missingNumbers(int[] numberInArray){
        int newArrayLength= numberInArray.length+1;
        int sumOfArray=newArrayLength*(newArrayLength+1)/2;
        int restSum=0;
        for (int i = 0; i < numberInArray.length; i++) {
            restSum=restSum+numberInArray[i];
        }
        return sumOfArray-restSum;

    }
}

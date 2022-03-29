import java.util.Scanner;

public class ArrayExercise6 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int arraySize = input.nextInt();
        int[] numbers = new int[arraySize];
        System.out.println("Enter the Array elements:");
        for (int arrayIndex = 0; arrayIndex < arraySize; arrayIndex++) {
            numbers[arrayIndex] = input.nextInt();
        }
        System.out.println("Array elements:");
        for (int arrayIndex = 0; arrayIndex < arraySize; arrayIndex++) {
            System.out.println(numbers[arrayIndex]);
        }
        System.out.println("Enter the Array elements to search:");
        int searchNumber= input.nextInt();
        for (int arrayIndex = 0; arrayIndex < arraySize; arrayIndex++) {
            if(arrayIndex== searchNumber){

                System.out.println("The number is present in the array in the index of:"+numbers[arrayIndex]);
            }
        }


    }
}

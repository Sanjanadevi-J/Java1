import java.util.Scanner;

public class ArrayExercise5 {
    public static void main(String[] args) {
        int sum = 0;
        double average=0;
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
        for(int arrayElement:numbers){
            sum= sum+arrayElement;
        }
        average=sum/arraySize;
        System.out.println("Average value of array is: "+average);
    }
}

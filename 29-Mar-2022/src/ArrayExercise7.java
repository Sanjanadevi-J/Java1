import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise7 {
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
        System.out.println(Arrays.toString(numbers));
        int indexPosition = input.nextInt();
        int value = input.nextInt();
        numbers[indexPosition]= value;
        System.out.println("New Array: "+Arrays.toString(numbers));

    }
}

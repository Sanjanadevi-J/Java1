import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise2 {
    public static void main(String[] args) {
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
        System.out.println("Array elements after sort:");
        for (int arrayIndex = 0; arrayIndex < arraySize; arrayIndex++) {
            for (int arrayNewIndex = arrayIndex; arrayNewIndex > 0; arrayNewIndex--) {
                if (numbers[arrayNewIndex] < numbers[arrayIndex - 1]) {
                    int temporary = numbers[arrayNewIndex];
                    numbers[arrayNewIndex] = numbers[arrayNewIndex - 1];
                    numbers[arrayNewIndex - 1] = temporary;
                }
            }
        }
            for (int arrayNewIndex = 0; arrayNewIndex < arraySize; arrayNewIndex++) {
                System.out.println(numbers[arrayNewIndex]);
            }

        }
    }


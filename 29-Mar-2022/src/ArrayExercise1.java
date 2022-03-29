import java.util.Scanner;

public class ArrayExercise1 {
    public static void main(String[] args) {
        try{
        int arraySize;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        arraySize = input.nextInt();
        int[] numberArray = new int[arraySize];
        System.out.println("Enter the elements of the array:");
        for (int inputArray = 0; inputArray < arraySize; inputArray++) {
            numberArray[inputArray] = input.nextInt();
        }
        System.out.println("Array elements:");
        for (int inputArray = 0; inputArray < arraySize; inputArray++) {
            System.out.println(numberArray[inputArray]);
        }
            System.out.print("Enter the element to remove from the array:");
            int elementRemove = input.nextInt();
            System.out.println("Array elements after remove");
            for (int inputArray = 0; inputArray < arraySize; inputArray++) {
                if (elementRemove == numberArray[inputArray]) {
                    continue;

                }

                System.out.println(numberArray[inputArray]);
            }
            }
        catch(Exception e){
            System.out.println("Check the inputs");
        }


            }

        }



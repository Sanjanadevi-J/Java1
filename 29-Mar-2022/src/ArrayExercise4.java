import java.util.Scanner;

public class ArrayExercise4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the size of Array :");
    System.out.print("Enter the row size of Array :");
    int arraySizeRow = input.nextInt();
    System.out.println("Enter the column size of Array :");
    int arraySizeColumn = input.nextInt();
    int[][] numbers = new int[arraySizeRow][arraySizeColumn];
    System.out.println("Enter the Array elements:");
    for(int arrayIndexRow = 0; arrayIndexRow<arraySizeRow;arrayIndexRow++) {
        for (int arrayIndexColumn = 0; arrayIndexColumn < arraySizeColumn; arrayIndexColumn++) {
            numbers[arrayIndexRow][arrayIndexColumn] = input.nextInt();
        }
    }
    System.out.println("Array elements:");
    for(int arrayIndexRow = 0; arrayIndexRow<arraySizeRow;arrayIndexRow++) {
        for (int arrayIndexColumn = 0; arrayIndexColumn < arraySizeColumn; arrayIndexColumn++) {
            System.out.print(numbers[arrayIndexRow][arrayIndexColumn]);
            System.out.print(" ");
        }
        System.out.println();
    }

}
}

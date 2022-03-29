import java.util.Scanner;

public class StringExercise1 {
    public static void main(String[]args){
        System.out.print("Enter the string:");
        Scanner inputString = new Scanner(System.in);
        String stringInput = inputString.nextLine();
        System.out.println("The original string: "+stringInput);
        System.out.print("Enter the index to search:");
        Scanner indexNumber= new Scanner(System.in);
        int inputIndex = indexNumber.nextInt();
        char characterFound = stringInput.charAt(inputIndex);
        System.out.println("character found in the given index:"+characterFound);
        System.out.print("Enter the index to search UniCode:");
        int inputIndexForUniCode = indexNumber.nextInt();
        int uniCodeFound = stringInput.charAt(inputIndexForUniCode);
        System.out.println("Unicode for the given index is:"+uniCodeFound);
        System.out.print("Enter the index to search UniCode number before the specified index:");
        int inputIndexForUniCodeBeforeSpecifiedIndex = indexNumber.nextInt();
        int uniCodeForBeforeIndex= stringInput.codePointBefore(inputIndexForUniCodeBeforeSpecifiedIndex);
        System.out.println("Unicode for the before the  specified index is:"+uniCodeForBeforeIndex);
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExercise1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array list:");
        int listSize= input.nextInt();
        List<Integer> numberList= new ArrayList<>(listSize);
        System.out.println("Enter the elements to enter to the list:");
        for(int index=0;index<listSize;index++){
            int arrayElements=input.nextInt();
            numberList.add(arrayElements);
        }
        System.out.println("ArrayList elements:"+numberList);
        System.out.print("enter the element to search:");
        Integer searchElement= input.nextInt();
        numberList.remove(searchElement);
        System.out.println(numberList);

        }

    }


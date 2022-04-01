import java.util.Scanner;

public class LogicalOperator1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers for operation:");
        int number1= input.nextInt();
        int number2= input.nextInt();
        int sumOfNumbers=number1+number2;
        int differenceOfNumbers=number1-number2;
        int productOfNumbers=number1*number2;
        int divisionOfNumbers =number1/number2;
        if(number1>number2 && sumOfNumbers>differenceOfNumbers){
            System.out.println("product of numbers is:"+productOfNumbers);
        }
        else{
            System.out.println("Division of numbers is"+divisionOfNumbers);
        }
    }
}

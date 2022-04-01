import java.util.Scanner;

public class LogicalOperator2 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1= input.nextInt();
        System.out.println("Enter number2: ");
        int number2= input.nextInt();
        System.out.println("Enter number3: ");
        int number3=input.nextInt();
        if(number1>number2 || number1>number3) {
            System.out.println("either number1 or number3 is greatest one");
        }
        if(number1 > number2 && number1> number3){
            System.out.println("number1 is greatest of three numbers");
        }
        else if(number3>number1 ){
            System.out.println("number3 is greatest");
        }
    }
}

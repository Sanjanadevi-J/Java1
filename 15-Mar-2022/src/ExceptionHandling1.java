public class ExceptionHandling1 {
       public static void main(String[]args){
           int a=100;
           try{
               int result = a/0;
           }
           catch(ArithmeticException e){
               System.out.println(e);
           }
           System.out.println("the code will be executed");
       }
}

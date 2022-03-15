public class ExceptionHandling2 {
    public static void main(String[]args){
        try{
        int n[]={1,2,3,4};
        System.out.println(n[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e);
    }
        System.out.println("The codes gets exited");
  }
}
        



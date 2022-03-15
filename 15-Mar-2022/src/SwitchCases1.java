public class SwitchCases1 {
    public static void main(String[]args){
        int age = 18;
        switch(age){
            case 13:
                System.out.println("not eligible");
            case 18:
                System.out.println("eligible");
            case 25:
                System.out.println("also eligible");
                break;
            default:
                System.out.println("enter the age");
                break;
        }
    }
}

public class TypeCasting2 {
    public static void main(String[]args){
        double d = 5.365498798;
        float f = (float)d;
        long l = (long)f;
        int i = (int)l;
        System.out.println("integer number is:"+i);
        System.out.println("long number is:"+l);
        System.out.println("float number is:"+f);
        System.out.println("double number is:"+d);
    }

}

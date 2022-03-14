import java.lang.String;
public class StringDemo {
    public static void main(String[]args) {
        String str= new String(" World ");
        str=str.concat("Level ");
        String s1=  " world level";
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.indexOf("l"));
        System.out.println(str.charAt(8));
        System.out.println(str.replace("el","els"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.compareTo(" World Leve"));
        System.out.println(str.trim());
        System.out.println(str.equalsIgnoreCase(s1));

    }
}

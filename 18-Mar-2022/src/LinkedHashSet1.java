import java.util.*;

public class LinkedHashSet1 {
    public static void main(String[]args){
        LinkedHashSet<String> language = new LinkedHashSet<String>();
        HashSet<String> languages = new HashSet<String>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        System.out.println("HashSet:"+languages);
        language.add("Java");
        language.add("Python");
        language.add("C++");
        language.add("Python");
        System.out.println("LinkedHashSet:"+languages);
        language.remove("C++");
        System.out.println("LinkedHashSet after removing:"+language);
        language.clear();
        System.out.println("LinkedHashSet after clean:"+language);


    }
}

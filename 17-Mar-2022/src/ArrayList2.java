import java.io.*;
import java.util.*;

public class ArrayList2 {
    public static void main(String[]args){
        ArrayList<Float> numbers = new ArrayList<Float>();
        try {
            numbers.add(3.545f);
            numbers.add(6.9f);
            numbers.add(9.366f);
            numbers.add(6.53f);
            System.out.println(numbers);
            System.out.println("Get the number:" + numbers.get(2));
            System.out.println("Set the number:" + numbers.set(2, 7.77f));
            for (float num : numbers) {
                System.out.println(num);
            }
        }
        catch(Exception e){
                System.out.println("Check the inputs ");
            }

    }
}

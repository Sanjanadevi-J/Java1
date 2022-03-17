import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> persons = new LinkedList<String>();
        persons.add("John");
        persons.add("Ravi");
        persons.add("James");
        System.out.println("Persons before adding" + persons);
        persons.add(1, "Rohit");
        System.out.println("Persons before adding" + persons);
        System.out.println("after descending order ");
        Iterator ite = persons.descendingIterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
        persons.push("Arun");
        System.out.println("Updated persons"+persons);

    }
}

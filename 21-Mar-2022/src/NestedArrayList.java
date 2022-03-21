import java.util.ArrayList;
import java.util.Iterator;
public class NestedArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> row1 = new ArrayList<>();
        ArrayList<Integer> row2 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        row2.add(4);
        row2.add(5);
        row2.add(6);
        matrix.add(row1);
        matrix.add(row2);
        System.out.println(matrix);
        Iterator number=matrix.iterator();
        while(number.hasNext()){
            System.out.println(number.next());
        }
        for (ArrayList<Integer> num : matrix) {
                System.out.print(num + " ");
            }
            System.out.println();

        for(ArrayList obj: matrix){
        ArrayList<Integer> temp = obj;
        for(Integer num : temp){
            System.out.print(num + " ");
        }
        System.out.println();
        }
        System.out.println(matrix.size());
    }
}


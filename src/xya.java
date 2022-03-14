import java.util.*;
public class xya {

        static void find(int array[]){
            int min=array[0];
            int max= array[0];
            for(int i=1;i<array.length;i++){
                if(array[i]<array[0]){
                    min=array[i];
                }
                else if(array[i]>array[0]){
                    max=array[i];
                }
            }
            System.out.println("Minimum number is:"+min);
            System.out.println("Maximum number is:"+max);

        }
        public static void main(String[]args){
            Scanner input= new Scanner(System.in);
            int number = input.nextInt();
            int array[] = new int[number];
            System.out.print("Array:");
            for(int i=0;i<number;i++){
                array[i]=input.nextInt();
                System.out.print(array[i]+",");
            }
            System.out.println("\b");
            find(array);
        }

    }


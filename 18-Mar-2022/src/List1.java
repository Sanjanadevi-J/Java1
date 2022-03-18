import java.util.*;
class Student{
    int studentId;
    String studentName;
    int studentMark;
    Student(int studentId,String studentName,int studentMark){
        this.studentId= studentId;
        this.studentName = studentName;
        this.studentMark=studentMark;
    }
}
public class List1 {
    public static void main(String[]args){
        List<Student> list=new ArrayList<>();
        Student student1 =new Student(100,"Max",550);
        Student student2=new Student(101,"William",535);
        list.add(student1);
        list.add(student2);
        for (Student student:list) {
            System.out.println("Student details: Id-"+student.studentId+",Name-"+student.studentName+",Mark-"+student.studentMark);
        }

    }

}

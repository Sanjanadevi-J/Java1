import java.util.*;
import java.util.stream.Collectors;
;
class Student{
    int studentId;
    String studentName;
    float studentMark;
    Student(int studentId,String studentName,float studentMark){
      this.studentId=studentId;
      this.studentName=studentName;
      this.studentMark=studentMark;
    }
}

public class Stream1 {
    public static void main(String[]args){
        List<Student> studentDetails = new ArrayList<Student>();
        studentDetails.add(new Student(100,"Arun",500.55f));
        studentDetails.add(new Student(101,"Charan",523.99f));
        studentDetails.add(new Student(102,"Raju",554.6f));
        studentDetails.add(new Student(103,"Ram",575.22f));
        studentDetails.add(new Student(104,"James",578.96f));
        List<Float> ListOfMark =studentDetails.stream()
                .filter(s -> s.studentMark > 500f)
                .map(s -> s.studentMark)
                .collect(Collectors.toList());
        System.out.println(ListOfMark);





    }
}

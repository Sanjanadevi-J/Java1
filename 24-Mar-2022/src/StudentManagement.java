import java.util.*;

class StudentDetails {
    String studentName;
    int studentRegisterNumber;
    String studentEmailId;
    String studentPhoneNumber;
    int studentAssessmentMark;
    String studentGender;
    int studentAge;
    int studentGrade;

    StudentDetails(String studentName, int studentRegisterNumber, String studentEmailId, String studentPhoneNumber, int studentAssessmentMark, String studentGender, int studentAge, int studentGrade) {
        this.studentName = studentName;
        this.studentRegisterNumber = studentRegisterNumber;
        this.studentEmailId = studentEmailId;
        this.studentPhoneNumber = studentPhoneNumber;
        this.studentAssessmentMark = studentAssessmentMark;
        this.studentGender = studentGender;
        this.studentAge = studentAge;
        this.studentGrade = studentGrade;
    }
    public String toString() {
        return "name:"+studentName+" "+"RegisterNo: "+studentRegisterNumber+" "+"EmailId:"+studentEmailId+" "+"PhoneNumber:"+studentPhoneNumber+" "+"Mark"+studentAssessmentMark+" "+"Gender"+studentGender+" "+"Age"+studentAge+" "+"Grade"+studentGrade;
    }
}
    public class StudentManagement {
    public static void main(String[] args) {
        try {
            Map<Integer, StudentDetails> studentDataBase = new HashMap<>();

            Scanner integerInput = new Scanner(System.in);
            Scanner stringInput = new Scanner(System.in);
            int choice;
            do {

                System.out.println("Enter 1 to add the details");
                System.out.println("Enter 2 to display the details");
                System.out.println("Enter 3 to search the details");
                System.out.println("Enter 4 to update the details");
                System.out.println("Enter 5 to delete the details");

                System.out.print("Enter the choice: ");
                choice = integerInput.nextInt();
                switch (choice) {
                    case 1://insert
                        System.out.print("Enter Student RegisterNumberOfStudent:");
                        int registerNumberOfStudent = integerInput.nextInt();
                        System.out.print("Enter Student Name:");
                        String studentName = stringInput.nextLine();
                        System.out.print("Enter Student RegisterNumber:");
                        int studentRegisterNumber = integerInput.nextInt();
                        System.out.print("Enter Student Email Id:");
                        String studentEmailId = stringInput.nextLine();
                        System.out.print("Enter Student Phone Number:");
                        String studentPhoneNumber = stringInput.nextLine();
                        System.out.print("Enter Student Marks:");
                        int studentMark = integerInput.nextInt();
                        System.out.print("Enter Student Gender:");
                        String studentGender = stringInput.nextLine();
                        System.out.print("Enter Student Age:");
                        int studentAge = integerInput.nextInt();
                        System.out.print("Enter Student Grade:");
                        int studentGrade = integerInput.nextInt();
                        studentDataBase.put(registerNumberOfStudent, new StudentDetails(studentName, studentRegisterNumber, studentEmailId, studentPhoneNumber, studentMark, studentGender, studentAge, studentGrade));
                        break;
                    case 2://display
                        System.out.println(studentDataBase);
                        break;
                    case 3://search
                        System.out.print("Enter the Register number of student to Search: ");
                        int studentNo = integerInput.nextInt();
                        StudentDetails studentSearched =studentDataBase.get(studentNo);
                        System.out.println(studentSearched.toString());
                        break;
                    case 4://update
                        System.out.print("Enter the Register number of student to update:");
                        studentNo = integerInput.nextInt();
                        System.out.print("Enter Student Name:");
                        studentName= stringInput.nextLine();
                        System.out.print("Enter Student RegisterNumberOfStudent:");
                        studentRegisterNumber= integerInput.nextInt();
                        System.out.print("Enter Student Email Id:");
                        studentEmailId= stringInput.nextLine();
                        System.out.print("Enter Student Phone Number:");
                        studentPhoneNumber= stringInput.nextLine();
                        System.out.print("Enter Student Marks:");
                        studentMark=integerInput.nextInt();
                        System.out.print("Enter Student Age:");
                        studentAge= integerInput.nextInt();
                        System.out.print("Enter Student Gender:");
                        studentGender= stringInput.nextLine();
                        System.out.print("Enter Student Grade:");
                        studentGrade= integerInput.nextInt();
                        StudentDetails studentUpdated =studentDataBase.replace(studentNo, new StudentDetails(studentName, studentRegisterNumber, studentEmailId, studentPhoneNumber, studentMark, studentGender, studentAge, studentGrade));
                        System.out.println(studentUpdated.toString());

                        break;
                    case 5://delete

                        System.out.print("Enter the Register number of student to delete: ");
                        studentNo = integerInput.nextInt();
                        StudentDetails studentRemoved = studentDataBase.remove(studentNo);
                        System.out.println(studentRemoved.toString());
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + choice);
                }

            }
            while (choice != 0);

        } catch (Exception e) {
            System.out.println("please check the inputs");
        }
    }
    }

    



    



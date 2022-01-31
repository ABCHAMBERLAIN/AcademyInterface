
import java.util.Arrays;
public class Student{
    int NumOfStudents;
    int max = 100;
    private String StudentName;
    private String StudentAddress;
    private int StudentID;
    int RNUM = 3;
    private Course[] CourseList = new Course[RNUM];

    public String getStudentName(){
        return StudentName;
    }

    public void setStudentName(String studentName) {
        this.StudentName = studentName;
    }

    public String getStudentAddress() {
        return StudentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.StudentAddress = studentAddress;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        this.StudentID = studentID;
    }


    public void addStudent (Student students){

        Student[NumOfStudents] = students;
        NumOfStudents++;
    }

    public void dropStudent (Student students){
        Student[NumOfStudents] = students;
        NumOfStudents--;
    }
    if(NumOfStudents = max) {
        System.out.println("We are currently not accepting new applicants for course");
    }
    else{
        int Space = max - NumOfStudents;
        System.out.println("We can accept" + Space + " in the course");
    }
}

}

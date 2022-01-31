import Student.Student;

import java.util.Arrays;

public class Course {
    private String CourseName;
    private String CourseID;
    private int StudentID;
    private int NumOfStudents;
    int max = 100;
    private Student [] students = new Student[max];

        public Course(){}

    public Course(String CourseName, String CourseID) {
        this.CourseID = CourseID;
        this.CourseName  = CourseName;    }

    public String getCourseName(){
        return CourseName;  //returns course name
    }

    public void setCourseName(String courseName) {
        this.CourseName = CourseName; //sets course name to another
    }



    public String getCourseID() {
        return CourseID; //Returns Course ID
    }

    public void setCourseID(String courseID) {
        this.CourseID = CourseID; //sets a new course ID
    }

    public int getStudentID() {
        return StudentID; //Returns a student's ID num
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public Student[] getStudents() {
        return Student; //
    }

    public int getNumOfStudents() {
        return NumOfStudents; //gets number of students in course
    }

    public void addStudent (Student students){
        Student[NumOfStudents] = students;
        NumOfStudents++;

    //Print Students in course
    public Student[] getStudents() {
        for (int k = 0; k < NumOfStudents; k++) {
            System.out.println(students[k].getStudentName());
        }

        public void dropStudent (Student students){
        Student[NumOfStudents] = this.students;
        NumOfStudents--;
   }
    if (NumOfStudents == max) {
        System.out.println("We are currently not accepting new applicants for course");
    }
    else{
      int Space = max - NumOfStudents;
        System.out.println("We can accept" + Space + " in the course");
    }
}



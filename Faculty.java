import java.util.Arrays;

    public class Faculty {
    private String FacultyName;
    private String FacultyAddress;
    private int FacultyID;
    int RNUM = 10;
    private Course[] CourseList = new Course[RNUM];
    private int RegCourses = 0;


        public Faculty(){

        }

        public Faculty(String facultyName, String facultyAddress, int facultyID) {
            this.FacultyName = facultyName;
            this.FacultyAddress = facultyAddress;
            this.FacultyID = facultyID;
        }


        public String getFacultyName(){
        return FacultyName;
    }

    public void setFacultyName(String facultyName) {
        this.FacultyName = facultyName;
    }

    public String getFacultyAddress() {
        return FacultyAddress;
    }

    public void setFacultyAddress(String facultyAddress) {
        this.FacultyAddress = facultyAddress;
    }

    public int getFacultyID() {
        return FacultyID;
    }

    public void setFacultyID(int facultyID) {
        this.FacultyID = facultyID;
    }
    //Print Faculty Courses
    public Course[] getCourseList() {
        for (int m = 0; m < RegCourses; m++) {
            System.out.println(CourseList[m].getCourseName());
        }

        }
    }

public class Model {

    String studentName;
    String studentID;
    String[] enrolledCourses;

    public Model() {
        this.studentName = "unknown";
        this.studentID = "";
        this.enrolledCourses = new String[]{};
    }

    public Model(String studentName, String studentID, String[] enrolledCourses) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.enrolledCourses = enrolledCourses;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public String[] getEnrolledCourses() {
        return this.enrolledCourses;
    }

}

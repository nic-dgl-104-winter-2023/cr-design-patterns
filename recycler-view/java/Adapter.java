import java.io.BufferedWriter;
import java.io.FileWriter;

public class Adapter {

    DataSource ds = new DataSource();

    public Adapter() {

    }

    public ViewHolder onCreateViewHolder() {
        ViewHolder vh = new ViewHolder();
        return vh;
    }

    public void onBindViewHolder(int currStudent) {

        ViewHolder vh = onCreateViewHolder();
        Model firstStudent = ds.students[currStudent];

        
        vh.studentName.text(firstStudent.getStudentName());
        vh.studentID.text(firstStudent.getStudentID());
        for (int i = 0; i < firstStudent.getEnrolledCourses().length; i++) {
            vh.enrolledCourses.append("<li>" + firstStudent.getEnrolledCourses()[i] + "</li>");
        }



        BufferedWriter writer = null;
        try{
            writer = new BufferedWriter(new FileWriter("./recycler-view/java/index.html"));
            writer.write(vh.htmlDocument.selectFirst("div").html());
            writer.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public int getDataSourceSize() {
        return ds.students.length;
    }
}

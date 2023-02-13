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

    public void onBindViewHolder() {

        ViewHolder vh = onCreateViewHolder();
        vh.studentName.text(ds.students[0].getStudentName());
        vh.studentID.text(ds.students[0].getStudentID());
        for (int i = 0; i < ds.students[0].getEnrolledCourses().length; i++) {
            vh.enrolledCourses.append("<li>" + ds.students[0].getEnrolledCourses()[i] + "</li>");
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

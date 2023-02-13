import java.io.File;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class ViewHolder {

    File file = new File("./recycler-view/java/view.html");
    
    Document htmlDocument;

    Element studentName;
    Element studentID;
    Element enrolledCourses;

    public ViewHolder() {
        try {
            this.htmlDocument = Jsoup.parse(file, "UTF-8", "http://example.com/");

            this.studentName = htmlDocument.select("#studentName").first();
            this.studentID = htmlDocument.select("#studentID").first();
            this.enrolledCourses = htmlDocument.select("#enrolledCourses").first();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /*
     * String reference;
     * 
     * {
     * try {
     * File htmlFile = new File("view.html");
     * this.reference = htmlFile.toString();
     * } catch (Exception e) {
     * System.out.println("Something went wrong");
     * }
     */

}

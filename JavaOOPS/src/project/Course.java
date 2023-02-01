package project;
import java.util.ArrayList;
import java.util.List;
public class Course {
	 private int courseId;
	    private String courseName;
	    private int courseDuration;
	    //private List<Employee> registeredEmployees;
	    public Course(int courseId, String courseName, int courseDuration) {
	        this.courseId = courseId;
	        this.courseName = courseName;
	        this.courseDuration = courseDuration;
	        //this.registeredEmployees = new ArrayList<Employee>();
	    }
	    public int getCourseId() {
	        return courseId;
	    }
	    public void setCourseId(int courseId) {
	        this.courseId = courseId;
	    }
	    public String getCourseName() {
	        return courseName;
	    }
	    public void setCourseName(String courseName) {
	        this.courseName = courseName;
	    }
	    public int getCourseDuration() {
	        return courseDuration;
	    }
	    public void setCourseDuration(int courseDuration) {
	        this.courseDuration = courseDuration;
	    }
	 //public void registerForCourse(Employee employee) {
	   //     registeredEmployees.add(employee);
	    //}
}

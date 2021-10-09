public class Course {
	//Example : [CS][3560] [Obj-Oriented Design and Prog]
	//      [Subject][Code] [Title]
	private String courseSubject; 
	private String courseCode;
	private String courseTitle;
	private String courseDescription;
	private String coursePrerequisites;
	private int courseCredit;
	
	public void createCourse(String courseCode, String courseSubject, String courseTitle, 
				 String courseDescription, String cousePrerequistes) {
		
	}
	
	public void deleteCourse() {
		
	}
	
	public Course searchCourse(String keyword) {
		return null;
		
	}
	
	public String getCourseSubject() {
		return courseSubject;
	}
	public void setCourseSubject(String courseSubject) {
		this.courseSubject = courseSubject;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public String getCoursePrerequisites() {
		return coursePrerequisites;
	}
	public void setCoursePrerequisites(String coursePrerequisites) {
		this.coursePrerequisites = coursePrerequisites;
	}
	public int getCourseCredit() {
		return courseCredit;
	}
	public void setCourseCredit(int courseCredit) {
		this.courseCredit = courseCredit;
	}
	
}

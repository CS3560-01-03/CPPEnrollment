
public class Student extends User {
	private int studentID;
	private String studentMajor;
	private Course[] courseCompleted;
	
	public Student createStudent(int studentID) {
		return null;
	}
	
	public void deleteStudent() {
	}
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentMajor() {
		return studentMajor;
	}
	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}

}

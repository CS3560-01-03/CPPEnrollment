public class CourseSection extends Course {
	
	private int sectionNumber;
	private int sectionStartTime;
	private int sectionRoomNumber;
	private boolean sectionWaitlist;
	private int sectionCapacity;
	private String sectionProfessor;
	
	public CourseSection createCourseSection(int sectionNumber, String sectionProfessor, in sectionRoomNumber,
						  int sectionCapacity, int sectionStartTime) {
	}
	
	public void deleteCourseSection() {
	}
	
	public int getSectionNumber() {
		return sectionNumber;
	}
	public void setSectionNumber(int sectionNumber) {
		this.sectionNumber = sectionNumber;
	}
	public int getSectionStartTime() {
		return sectionStartTime;
	}
	public void setSectionStartTime(int sectionStartTime) {
		this.sectionStartTime = sectionStartTime;
	}
	public int getSectionRoomNumber() {
		return sectionRoomNumber;
	}
	public void setSectionRoomNumber(int sectionRoomNumber) {
		this.sectionRoomNumber = sectionRoomNumber;
	}
	public boolean isSectionWaitlist() {
		return sectionWaitlist;
	}
	public void setSectionWaitlist(boolean sectionWaitlist) {
		this.sectionWaitlist = sectionWaitlist;
	}
	public int getSectionCapacity() {
		return sectionCapacity;
	}
	public void setSectionCapacity(int sectionCapacity) {
		this.sectionCapacity = sectionCapacity;
	}
	public String getSectionProfessor() {
		return sectionProfessor;
	}
	public void setSectionProfessor(String sectionProfessor) {
		this.sectionProfessor = sectionProfessor;
	}
	
}


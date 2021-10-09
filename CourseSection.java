public class CourseSection extends Course { //subclass of Course.java
	
	private int sectionNumber;										// section number
	private int sectionStartTime;										// class start time
	private int sectionRoomNumber;										// classroom number
	private boolean sectionWaitlist;									// (yes/no) waitlist
	private int sectionCapacity;										// max capacity of students
	private String sectionProfessor;									// professor's name
	
	public CourseSection createCourseSection(int sectionNumber, String sectionProfessor, in sectionRoomNumber, // method to create a new CourseSection
						  int sectionCapacity, int sectionStartTime) {
	}
	
	public void deleteCourseSection() {										// method to delete a CourseSection
	}
	
	public int getSectionNumber() {											// sectionNumber getter
		return sectionNumber;
	}
	public void setSectionNumber(int sectionNumber) {								// sectionNumber setter
		this.sectionNumber = sectionNumber;
	}
	public int getSectionStartTime() {										// sectionStartTime getter
		return sectionStartTime;
	}
	public void setSectionStartTime(int sectionStartTime) {								// sectionStartTime setter
		this.sectionStartTime = sectionStartTime;
	}
	public int getSectionRoomNumber() {										// sectionRoomNumber getter
		return sectionRoomNumber;
	}
	public void setSectionRoomNumber(int sectionRoomNumber) {							// sectionRoomNumber setter
		this.sectionRoomNumber = sectionRoomNumber;
	}
	public boolean isSectionWaitlist() {										// sectionWaitlist getter
		return sectionWaitlist;
	}
	public void setSectionWaitlist(boolean sectionWaitlist) {							// sectionWaitlist setter
		this.sectionWaitlist = sectionWaitlist;
	}
	public int getSectionCapacity() {										// sectionSectionCapacity setter
		return sectionCapacity;
	}
	public void setSectionCapacity(int sectionCapacity) {								// sectionSectionCapacity getter
		this.sectionCapacity = sectionCapacity;
	}
	public String getSectionProfessor() {										// sectionSectionProfessor setter
		return sectionProfessor;
	}
	public void setSectionProfessor(String sectionProfessor) {							// sectionSectionProfessor getter
		this.sectionProfessor = sectionProfessor;
	}
	
}


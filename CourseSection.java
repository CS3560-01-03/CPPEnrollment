public class courseSection extends Course {
	
	public int sectionNumber;
	public int startTime;
	public int roomNumber;
	public boolean waitlist;
	public int sectionCapacity;
	public String professorName;
	
	public void createCourseSection(String sectionNumber) {
		// fill later
	}
	
	public void deleteCourseSection() {
		// fill later
	}
	
	public int getSectionNumber() {
		return sectionNumber;
	}
	public void setSectionNumber(int sectionNumber) {
		this.sectionNumber = sectionNumber;
	}
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public boolean isWaitlist() {
		return waitlist;
	}
	public void setWaitlist(boolean waitlist) {
		this.waitlist = waitlist;
	}
	public int getSectionCapacity() {
		return sectionCapacity;
	}
	public void setSectionCapacity(int sectionCapacity) {
		this.sectionCapacity = sectionCapacity;
	}
	public String getProfessorName() {
		return professorName;
	}
	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}
}


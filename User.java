import java.time.LocalDate;

public class User {
	private String name;
	private String address;
	private LocalDate dateOfBirth;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int year, int month, int day) {
		this.dateOfBirth = LocalDate.of(year, month, day);
	}
}

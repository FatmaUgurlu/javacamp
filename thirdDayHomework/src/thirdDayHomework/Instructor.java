package thirdDayHomework;

public class Instructor extends User{
	private String educationName;
	private String languange;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String firstName, String lastName, String email, String password, String educationName,String languange) {
		
		this.educationName = educationName;
		this.languange = languange;
	}

	public String getEducationName() {
		return educationName;
	}

	public void setEducationName(String educationName) {
		this.educationName = educationName;
	}

	public String getLanguange() {
		return languange;
	}

	public void setLanguange(String languange) {
		this.languange = languange;
	}
	

}

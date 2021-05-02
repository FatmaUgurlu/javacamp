package thirdDayHomework;

public class Student extends User{
	private String levelOfEducation;
	private int successScore;
	
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, String email, String password, String levelOfEducation,int successScore) {
		
		this.levelOfEducation = levelOfEducation;
		this.successScore = successScore;
	}

	public String getLevelOfEducation() {
		return levelOfEducation;
	}

	public void setLevelOfEducation(String levelOfEducation) {
		this.levelOfEducation = levelOfEducation;
	}

	public int getSuccessScore() {
		return successScore;
	}

	public void setSuccessScore(int successScore) {
		this.successScore = successScore;
	}



}

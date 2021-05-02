package thirdDayHomework;

public class Main {

	public static void main(String[] args) {
	
		Instructor instructor = new Instructor(1, "Engin" , "Demiro�" , "engindemirog@hotmail.com" , "12345", "Java Dersi" , "�ngilizce");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.save(instructor);
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Fatma");
		student.setLastName("U�urlu");
		
		StudentManager studentManager = new StudentManager();
		studentManager.upload(student);
		
		UserManager usermanager = new UserManager();
	    usermanager.add(student);
	    usermanager.delete(student);
	    usermanager.update(student);
		
		
	}
}

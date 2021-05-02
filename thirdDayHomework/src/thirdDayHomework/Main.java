package thirdDayHomework;

public class Main {

	public static void main(String[] args) {
	
		Instructor instructor = new Instructor(1, "Engin" , "Demiroğ" , "engindemirog@hotmail.com" , "12345", "Java Dersi" , "İngilizce");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.save(instructor);
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Fatma");
		student.setLastName("Uğurlu");
		
		StudentManager studentManager = new StudentManager();
		studentManager.upload(student);
		
		UserManager usermanager = new UserManager();
	    usermanager.add(student);
	    usermanager.delete(student);
	    usermanager.update(student);
		
		
	}
}


public class Main {

	public static void main(String[] args) {
		Course course1 = new Course ();
	    course1.id = 1 ;
	    course1.name = "MatLab";
	    course1.website = "Udemy";
	
	

	Course course2 = new Course();
	    course2.id = 2;
	    course2.name = "Phyton";
	    course2.website = "Kodlama.io";
	    
	    
	CourseManager CourseManager = new CourseManager();
	CourseManager.KursaGir(course1);
	CourseManager.KayitOl(course1);
	
	

}


	}


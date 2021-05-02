package day3;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student(1, "Alperen", "Saylar", "alpisa1907@gmail.com"); 
		Student student2 = new Student(2, "Melih", "Karatekin", "melihkaratekin@gmail.com"); 
		
		Instructor instructor1 = new Instructor(1,"Engin", "Demirog","engindemirog@gmail.com");
		
		UserManager userManager = new UserManager();
		userManager.add(student1);
		userManager.add(student2);
		userManager.update(student1);
		userManager.update(student2);
	
		userManager.add(instructor1);
		userManager.update(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.register("C#");
		studentManager.register("Java");
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addHomework();
		
	}

}
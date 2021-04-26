package day2;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1,"C#");
		Course course2 = new Course(2,"Java");
		Course course3 = new Course(3,"Python");
				
		Course[] Courses = {course1,course2,course3};
		
		for(Course course : Courses) {
			System.out.println(course.CourseName);
		}
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.Add(course1);
		courseManager.Add(course2);
		courseManager.Add(course3);
		courseManager.Delete(course3);
		
		Instructor instructor1 = new Instructor(1,"Engin");
		Instructor instructor2 = new Instructor(2,"Kerem");
		Instructor instructor3 = new Instructor(3,"Alperen");
		Instructor instructor4 = new Instructor(4,"Melih");
		
		Instructor[] Instructors = {instructor1,instructor2,instructor3,instructor4};
		
		
		for(Instructor instructor : Instructors)
		{
			System.out.println(instructor.InstructoreName);
		}
		
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.Add(instructor1);
		instructorManager.Add(instructor2);
		instructorManager.Add(instructor3);
		instructorManager.Add(instructor4);
		instructorManager.Delete(instructor3);
		instructorManager.Delete(instructor4);
		
		
		
	}

}

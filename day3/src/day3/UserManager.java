package day3;

public class UserManager {
	
	public void add(User user)
	{
		System.out.println(user.getFirstName() + " " + user.getLastName() + " eklendi");
	}
	
	public void update(User user)
	{
		System.out.println(user.getFirstName() + " " + user.getLastName() + " güncellendi");
	}

}
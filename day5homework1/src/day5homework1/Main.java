package day5homework1;

import day5homework1.business.concretes.UserManager;
import day5homework1.business.concretes.ValidateManager;
import day5homework1.core.GoogleAdapter;
import day5homework1.core.RegisterService;
import day5homework1.dataAccess.concretes.HibernateUserDao;
import day5homework1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1=new User(1,"Alperen","Saylar","alpisa1907@mail.com","123456");
		User user2=new User(2,"Melih","Karatekin","melih@mail.com","456789");
		User user3=new User(3,"Engin","Demirog","engin@mail.com","741");
	
		UserManager userManager = new UserManager(new HibernateUserDao(), new ValidateManager());
		
		userManager.register(user1);
		userManager.register(user2);
		userManager.register(user3);
		System.out.println("-------------------------");
		
		userManager.login(user1);
		userManager.login(user2);
		System.out.println("-------------------------");
		
		RegisterService registerService = new GoogleAdapter();
		
		registerService.registerSystem("google@gmail.com", "123456");
		registerService.loginSystem("google", "google");

	}
	

}

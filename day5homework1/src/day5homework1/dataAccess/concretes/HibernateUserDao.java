package day5homework1.dataAccess.concretes;

import java.util.List;

import day5homework1.dataAccess.abstracts.UserDao;
import day5homework1.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	
	@Override
	public void register(User user) {
		System.out.println("Hibernate ile kayýt yapýldý : " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void login(User user) {
		System.out.println("Hibernate ile giriþ yapýldý : " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public List<User> getAll() {
		return null;
	}
}

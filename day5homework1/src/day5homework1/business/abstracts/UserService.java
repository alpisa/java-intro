package day5homework1.business.abstracts;

import java.util.List;

import day5homework1.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(User user);
	List<User> getAll();
	
}

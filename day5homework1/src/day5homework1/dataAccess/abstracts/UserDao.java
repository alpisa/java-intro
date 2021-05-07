package day5homework1.dataAccess.abstracts;

import java.util.List;

import day5homework1.entities.concretes.User;

public interface UserDao {
	void register(User user);
	void login(User user);
	List<User> getAll();
}
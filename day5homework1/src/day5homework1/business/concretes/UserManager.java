package day5homework1.business.concretes;

import java.util.List;

import day5homework1.business.abstracts.UserService;
import day5homework1.business.abstracts.ValidateService;
import day5homework1.dataAccess.abstracts.UserDao;
import day5homework1.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private ValidateService validateService;
	private int PasswordLength = 6;
	private int NameLength = 2;

	public UserManager(UserDao userDao, ValidateService validateService) {
		super();
		this.userDao = userDao;
		this.validateService = validateService;
	}

	@Override
	public void register(User user){
		if(check(user))
		{	
			if (user.getPassword().length() >= this.PasswordLength && checkMail(user)==true && checkFirstLastName(user)==true)
			{
				System.out.println("Kay�t Ba�ar�l� : " + user.getFirstName());
				userDao.register(user);
				validateService.validate(user);
			}
			else
			{
				System.out.println("!!! Kay�t Ba�ar�s�z !!!" );
				System.out.println("!!! Sifreniz en az 6 olmal�d�r !!!" );
				System.out.println("!!! Email adresiniz kullan�lmam�� olmal�d�r !!!" );
				System.out.println("!!! Ad�n�z soyad�n�z en az 2 karakter olmal�d�r !!!" );
			}
		}
		else
		{
			System.out.println("!!! Bilgilerinizi bo� b�rakmay�n�z !!!" );
		}		
}

	@Override
	public void login(User user) {
		if (user.getEmail()!= null && user.getPassword()!= null) {
			System.out.println("Giris Basar�l� : " + user.getFirstName());
		}else {
			System.out.println("!!! Email/Sifre Eksik !!!");
		}
		
	}
	
	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}
	
	private boolean check(User user) {
		if (user.getFirstName()!="" && user.getLastName()!="" && user.getEmail()!="" && user.getPassword()!="" ) {
			 return true;
		}else {
			return false;
		}
	}
	private boolean checkFirstLastName(User user) {
		if (user.getFirstName().length()>NameLength && user.getLastName().length()>NameLength) {
			return true;
		}
		else {
			return false;
		}
	}

	private boolean checkMail(User user) {
		if (user.getEmail().matches(".*@.*")==true) {
			return true;
		}else {
			return false;
		}
	}



}

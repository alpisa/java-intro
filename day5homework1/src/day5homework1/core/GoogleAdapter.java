package day5homework1.core;

import day5homework1.google.GoogleManager;

public class GoogleAdapter implements RegisterService {
	
	GoogleManager google = new GoogleManager();
	
	@Override
	public void registerSystem(String email, String password) {
		google.register(email, password);
		
	}

	@Override
	public void loginSystem(String email, String password) {
		google.login(email,password);
	}

}

package day5homework1.business.concretes;

import day5homework1.business.abstracts.ValidateService;
import day5homework1.entities.concretes.User;

public class ValidateManager implements ValidateService {

	@Override
	public void validate(User user) {
		System.out.println("Dogrulama maili gönderildi : " + user.getEmail());
		
	}

}

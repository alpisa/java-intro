package Validation;

import Abstract.CustomerValidationService;
import Entities.Customer;

public class Validation implements CustomerValidationService {

	@Override
	public boolean eDevlet(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " dogrulandý.");
		return true;
	}
	
}

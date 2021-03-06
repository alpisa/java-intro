package Concrete;

import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {

	@Override
	public void add(Customer customer){
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " : kullanıcı sisteme eklendi");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " : kullanıcı bilgileri sistemde güncellendi");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " "  + customer.getLastName() + " : kullanıcı sistemden silindi");
		
	}


}
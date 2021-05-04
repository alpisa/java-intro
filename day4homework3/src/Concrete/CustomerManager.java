package Concrete;

import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {

	@Override
	public void add(Customer customer){
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " : kullan�c� sisteme eklendi");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " : kullan�c� bilgileri sistemde g�ncellendi");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " "  + customer.getLastName() + " : kullan�c� sistemden silindi");
		
	}


}
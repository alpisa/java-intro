package nLayeredDemo;

import nLayeredDemo.business.abstratcs.ProductService;
import nLayeredDemo.business.conctretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;


public class Main {

	public static void main(String[] args) {
		
		//ToDo Spring IoC ile ��z�lecek 
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter()); 
		
		Product product = new Product(1,2,"ELma",12,50);
		productService.add(product);
	}

}

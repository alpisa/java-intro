package project;

import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;
import Validation.Validation;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1, "Alperen", "Saylar","11111111111",1997);
		Customer customer2 = new Customer(2, "Melıh", "Karatekın","22222222222",1997);
		Customer customer3 = new Customer(3, "Engin", "Demırog", "33333333333",1997);
		
		Game game1 = new Game(101, "LoL", 100);
		Game game2 = new Game(102, "Counter Strike", 200);
		Game game3 = new Game(103, "Valorant", 300);
		
		Campaign campaign1 = new Campaign(201, "Öðrenci", 20);
		Campaign campaign2 = new Campaign(202, "Öðrenci", 20);
		Campaign campaign3 = new Campaign(203, "Öðrenci", 20);
		
		
		CustomerManager customerManager = new CustomerManager();
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager();
		SalesManager salesManager = new SalesManager();
		Validation validation = new Validation();
		
		
		customerManager.add(customer1);
		validation.eDevlet(customer1);
		gameManager.add(game1);
		campaignManager.add(campaign1);
		salesManager.buy(customer1, game1, campaign1);
		System.out.println("------------------------------------");
		
		customerManager.add(customer2);
		validation.eDevlet(customer2);
		gameManager.add(game2);
		campaignManager.add(campaign2);
		salesManager.campaignPurchase(customer2, game2, campaign2);
		System.out.println("------------------------------------");
		
		customerManager.add(customer3);
		validation.eDevlet(customer3);
		gameManager.add(game3);
		campaignManager.add(campaign3);
		salesManager.campaignPurchase(customer3, game3, campaign3);
		System.out.println("------------------------------------");
		

	
	}
}

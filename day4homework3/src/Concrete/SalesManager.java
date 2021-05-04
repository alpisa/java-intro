package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class SalesManager implements SalesService {

	@Override
	public void buy(Customer customer, Game game, Campaign campaign) {
		System.out.println("Müsteri : " + customer.getFirstName() + " " + customer.getLastName());
		System.out.println("Alýnan Oyun : " + game.getGameName());
		System.out.println("Ödenen Fiyat : " + game.getGamePrice() + "TL");
	}
	
	@Override
	public void campaignPurchase(Customer customer, Game game, Campaign campaign) {		
		
		System.out.println("Müsteri : " + customer.getFirstName() + " " + customer.getLastName());
		System.out.println("Alýnan Oyun : " + game.getGameName());
		System.out.println("Uygulanan Indýrým  % : " + campaign.getDiscount());

	}


		


}

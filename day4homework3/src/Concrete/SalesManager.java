package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class SalesManager implements SalesService {

	@Override
	public void buy(Customer customer, Game game, Campaign campaign) {
		System.out.println("M�steri : " + customer.getFirstName() + " " + customer.getLastName());
		System.out.println("Al�nan Oyun : " + game.getGameName());
		System.out.println("�denen Fiyat : " + game.getGamePrice() + "TL");
	}
	
	@Override
	public void campaignPurchase(Customer customer, Game game, Campaign campaign) {		
		
		System.out.println("M�steri : " + customer.getFirstName() + " " + customer.getLastName());
		System.out.println("Al�nan Oyun : " + game.getGameName());
		System.out.println("Uygulanan Ind�r�m  % : " + campaign.getDiscount());

	}


		


}

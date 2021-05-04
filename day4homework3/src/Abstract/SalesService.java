package Abstract;

import Entities.Customer;
import Entities.Game;
import Entities.Campaign;

public interface SalesService {

	void buy(Customer customer, Game game, Campaign campaign);
	void campaignPurchase(Customer customer, Game game, Campaign campaign);
	
}

package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public interface SaleService {

	void discount(Game game, Campaign campaign);
	
	void buy(Game game, User user);
}

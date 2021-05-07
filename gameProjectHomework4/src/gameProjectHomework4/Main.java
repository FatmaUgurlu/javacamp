package gameProjectHomework4;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setIdentityNumber("1234567899");	
		user.setFirstName("Fatma");
		user.setLastName("Uðurlu");
		user.setBirthOfDay(1989);


		UserManager userManager = new UserManager(new MernisServiceAdapter());
		userManager.add(user);
		
		Game game = new Game();
		game.setId(1);
		game.setGameName("PubG");
		game.setUnitPrice(100);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
			
		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setCampaignName("Yeni üyelik kampanyasý");
		campaign.setDiscountRate(40);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.campaignCheck(campaign);
		
		
		SaleManager saleManager = new SaleManager(campaignManager);
		saleManager.buy(game, user);
		
	}

}

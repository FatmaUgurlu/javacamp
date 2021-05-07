package Concrete;

import Abstract.CampaignService;
import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class SaleManager implements SaleService{
	
   private CampaignService campaignService;

	public SaleManager(CampaignService campaignService) {
		super();
		this.campaignService = campaignService;
	}

	@Override
	public void discount(Game game, Campaign campaign) {
		System.out.println(game.getGameName() + " " + campaign.getDiscountRate() + " " + "indirim yapýldý.");
		
		this.campaignService.add(campaign);
	}

	@Override
	public void buy(Game game, User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + ": " + game.getGameName() + " " + "satýn alýndý.");
		
	}

}

package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " " + "Eklendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " " + "Silindi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getDiscountRate() + " " + "Ýndirim oraný güncellendi.");
		
	}

	@Override
	public boolean campaignCheck(Campaign campaign) {
		
		return true;
	}

}

package games;

public interface CampaignService {
	
	void addCampaign(GameSale gameSale,Campaign campaing);
	void deleteCampaign(GameSale gameSale,Campaign campaing);
	void updateCampaign(Campaign campaing,String campaignName,double campaingDiscount);
	void discount(GameSale gameSale,Campaign campaing);

}

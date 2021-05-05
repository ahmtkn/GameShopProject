package games;

public class CampaingManager implements CampaignService {
	
	double discountService;
	
	public CampaingManager(double discountService) {
		this.discountService = discountService;
	}

	@Override
	public void addCampaign(GameSale gameSale, Campaign campaing) {
		System.out.println("************************************************************");
		System.out.println(gameSale.getGameName() + " Adl� Oyuna " + campaing.getCampaignName() + " Kampanyas� Gelmi�tir!");
		System.out.println("************************************************************");
		
	}

	@Override
	public void deleteCampaign(GameSale gameSale, Campaign campaing) {
		System.out.println("************************************************************");
		System.out.println(gameSale.getGameName() + " Adl� Oyundan " + campaing.getCampaignName() + " Kampanyas� Kald�r�lm��t�r!");
		System.out.println("************************************************************");
		
		
	}

	@Override
	public void updateCampaign(Campaign campaing,String campaignName,double campaingDiscount) {
		if(campaignName != null) {
			campaing.setCampaignName(campaignName);
			System.out.println("Kampanya Ad� G�ncellendi: " + campaing.getCampaignName());
		}else if(campaingDiscount != 0) {
			campaing.setCampaingDiscount(campaingDiscount);
			System.out.println("Kapmayan�n indirim Oran� G�ncellenci: " + campaing.getCampaingDiscount());
		}
	}

	@Override
	public void discount(GameSale gameSale, Campaign campaing) {
		System.out.println(gameSale.getGameName() + " Oyununa " + campaing.getCampaignName() + " Kapmanyas� Uygulanarak Yeni Fiyat�: " + this.discountService );
		
	}

}

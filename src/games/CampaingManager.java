package games;

public class CampaingManager implements CampaignService {
	
	double discountService;
	
	public CampaingManager(double discountService) {
		this.discountService = discountService;
	}

	@Override
	public void addCampaign(GameSale gameSale, Campaign campaing) {
		System.out.println("************************************************************");
		System.out.println(gameSale.getGameName() + " Adlý Oyuna " + campaing.getCampaignName() + " Kampanyasý Gelmiþtir!");
		System.out.println("************************************************************");
		
	}

	@Override
	public void deleteCampaign(GameSale gameSale, Campaign campaing) {
		System.out.println("************************************************************");
		System.out.println(gameSale.getGameName() + " Adlý Oyundan " + campaing.getCampaignName() + " Kampanyasý Kaldýrýlmýþtýr!");
		System.out.println("************************************************************");
		
		
	}

	@Override
	public void updateCampaign(Campaign campaing,String campaignName,double campaingDiscount) {
		if(campaignName != null) {
			campaing.setCampaignName(campaignName);
			System.out.println("Kampanya Adý Güncellendi: " + campaing.getCampaignName());
		}else if(campaingDiscount != 0) {
			campaing.setCampaingDiscount(campaingDiscount);
			System.out.println("Kapmayanýn indirim Oraný Güncellenci: " + campaing.getCampaingDiscount());
		}
	}

	@Override
	public void discount(GameSale gameSale, Campaign campaing) {
		System.out.println(gameSale.getGameName() + " Oyununa " + campaing.getCampaignName() + " Kapmanyasý Uygulanarak Yeni Fiyatý: " + this.discountService );
		
	}

}

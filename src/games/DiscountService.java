package games;

public class DiscountService {
	
	public static double discountManager(GameSale gameSale,Campaign campaing) {
		return gameSale.getGamePrice() - ((gameSale.getGamePrice()*campaing.getCampaingDiscount())/100);
	}

}

package games;

public class Main {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.setFirstName("Ahmet");
		player.setLastName("Tekin");
		player.setDateOfBirth("2000");
		player.setNationalIdentity("12345678922");
		
		PlayerManager playerManager = new PlayerManager( new PlayerCheckManager());
		playerManager.register(player);
		playerManager.delete(player);
		playerManager.update(player, "Gürkan", null,null, null);
		
		GameSale game = new GameSale();
		game.setGameId(1);
		game.setGameName("PAYDAY 2");
		game.setPrice(100);
		game.setGameDescription("\nGerçek Zamanlý Hýrsýzlýk Oyunu \nFiyatý: " + game.getGamePrice());
		
		GameSaleManager gameManager = new GameSaleManager();
		gameManager.seeGame(game);
		gameManager.buyGame(player, game);
		
		Campaign campaing = new Campaign();
		campaing.setCampaingId(1);
		campaing.setCampaignName("Bahar Ýndirimleri");
		campaing.setCampaingDiscount(10);
		
		CampaingManager campaingManager = new CampaingManager(DiscountService.discountManager(game, campaing));
		campaingManager.addCampaign(game, campaing);
		campaingManager.updateCampaign(campaing, null, 15);
		campaingManager.deleteCampaign(game, campaing);
		campaingManager.discount(game, campaing);
		

	}

}

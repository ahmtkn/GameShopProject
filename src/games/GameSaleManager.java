package games;

public class GameSaleManager implements GameService {
	
	public GameSaleManager() {
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<< OYUN SATIÞ MAÐAZASI >>>>>>>>>>>>>>>>>>>>>>>>>");
	}
	
	@Override
	public void seeGame(GameSale gameSale) {
		System.out.println(gameSale.getGameName() + " OYUNU AYRINTILARI: " + gameSale.getGameDescription());
	}

	@Override
	public void buyGame(Player player,GameSale gameSale) {
		System.out.println("************************************************************");
		System.out.println(player.getFirstName() + " " + player.getLastName() + " oyuncusu " + gameSale.getGameName() + " satýn aldý ");
		System.out.println("************************************************************");
	}

	

}

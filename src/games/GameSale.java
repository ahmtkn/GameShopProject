package games;

public class GameSale {
	private int gameId;
	private String gameName;
	private String gameDescription;
	private double gamePrice;
	
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getGameDescription() {
		return gameDescription;
	}
	public void setGameDescription(String gameDescription) {
		this.gameDescription = gameDescription;
	}
	public double getGamePrice() {
		return gamePrice;
	}
	public void setPrice(double price) {
		this.gamePrice = price;
	}


}

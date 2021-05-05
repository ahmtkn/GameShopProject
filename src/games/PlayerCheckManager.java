package games;

public class PlayerCheckManager implements PlayerCheck{

	@Override
	public boolean checkPlayer(Player player) {
		if (!player.getFirstName().isEmpty() && player.getDateOfBirth().length() == 4 && player.getNationalIdentity().length() == 11) {
			return true;
		}else {
			return false;
		}
	}
	
}

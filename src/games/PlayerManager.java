package games;

import java.time.LocalDate;

public class PlayerManager implements PlayerService {
	
	PlayerCheckManager checkManager;

	public PlayerManager(PlayerCheckManager checkManager) {
		this.checkManager = checkManager;
	}

	@Override
	public void register(Player player) {
		if(checkManager.checkPlayer(player)) {
			System.out.println("************************************************************");
			System.out.println("Kimlik Kontrol� Ba�ar�l�!");
			System.out.println("!! Oyuncu Ba�ar�l� Bir �ekilde Kay�t Edilmi�tir!!");
			System.out.println("Oyuncu Ad�: " + player.getFirstName() + " " + player.getLastName() );
			System.out.println("Oyuncunun Ya��: " + LocalDate.now().getYear()  );
			System.out.println("************************************************************");
		}else {
			System.out.println("************************************************************");
			System.out.println("Kimlik Do�rulama ��lemi Ba�ar�s�z!!");
			System.out.println("************************************************************");
		}
		
	}

	@Override
	public void delete(Player player) {
		System.out.println("************************************************************");
		System.out.println("Oyuncu Silindi: " + player.getFirstName() + " " + player.getLastName());
		System.out.println("************************************************************");
		
	}

	@Override
	public void update(Player player,String name ,String lasName,String nationalIdentity,String dateOfBirth) {
		System.out.println("************************************************************");
		if(name != null) {
			player.setFirstName(name);
			System.out.println("�sim Ba�ar�yla G�ncellendi: " + player.getFirstName());
		}else if(lasName != null) {
			player.setLastName(lasName);
			System.out.println("Soyad Ba�ar�yla G�ncellendi: " + player.getLastName());
		}else if(nationalIdentity != null) {
			player.setNationalIdentity(nationalIdentity);
			System.out.println("TC Kimlik No Ba�ar�yla G�ncellendi: " + player.getNationalIdentity());
		}else if(dateOfBirth != null) {
			player.setDateOfBirth(dateOfBirth);
			System.out.println("TC Kimlik No Ba�ar�yla G�ncellendi: " + player.getDateOfBirth());
		}
		System.out.println("************************************************************");
	}

}

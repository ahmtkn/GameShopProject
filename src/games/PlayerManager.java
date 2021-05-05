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
			System.out.println("Kimlik Kontrolü Baþarýlý!");
			System.out.println("!! Oyuncu Baþarýlý Bir Þekilde Kayýt Edilmiþtir!!");
			System.out.println("Oyuncu Adý: " + player.getFirstName() + " " + player.getLastName() );
			System.out.println("Oyuncunun Yaþý: " + LocalDate.now().getYear()  );
			System.out.println("************************************************************");
		}else {
			System.out.println("************************************************************");
			System.out.println("Kimlik Doðrulama Ýþlemi Baþarýsýz!!");
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
			System.out.println("Ýsim Baþarýyla Güncellendi: " + player.getFirstName());
		}else if(lasName != null) {
			player.setLastName(lasName);
			System.out.println("Soyad Baþarýyla Güncellendi: " + player.getLastName());
		}else if(nationalIdentity != null) {
			player.setNationalIdentity(nationalIdentity);
			System.out.println("TC Kimlik No Baþarýyla Güncellendi: " + player.getNationalIdentity());
		}else if(dateOfBirth != null) {
			player.setDateOfBirth(dateOfBirth);
			System.out.println("TC Kimlik No Baþarýyla Güncellendi: " + player.getDateOfBirth());
		}
		System.out.println("************************************************************");
	}

}

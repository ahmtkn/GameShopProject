package games;

public interface PlayerService {
	void register(Player player);
	void delete(Player player);
	void update(Player player,String name,String surName,String nationalIdentity,String dateOfBirth);
}

package net.haenkos.EquipmentSystem;

public class main {

	public static void main(String[] args) {
		BaseCharacter player = new Character();

		player.printStats();

		player = new Cuirass(player);

		player.printStats();

		player = new Helmet(player);

		player.printStats();
	}
}

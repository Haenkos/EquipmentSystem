package net.haenkos.EquipmentSystem;

public class main {

	public static void main(String[] args) {
		
		int[] startingStats = {3,3,4,5,4};
		BaseCharacter player = new Character(startingStats);

		player.printStats();
		player.Attack();
		player.Jump();

		player = new Cuirass(player);

		player = new Helmet(player);

		player = new SpearOfStamina(player);

		player = new RepeaterBoots(player);

		player.printStats();
		player.Attack();

		player.Jump();
	}
}

package net.haenkos.EquipmentSystem;

public class SpearOfStamina extends BaseEquipment {

    private float staminaModifier = 1.2f;

    private float attackModifier = 1.3f;

    public SpearOfStamina(BaseCharacter character) {
        super(character);

        super.character.setStamina(character.getStamina()*staminaModifier);
        super.character.setAttack(character.getAttack()*attackModifier);
    }

    @Override
    public void Attack() {
        System.out.println("Stab with spear! " + character.getAttack() + " damage dealth!\n");
    }
}

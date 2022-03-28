package net.haenkos.EquipmentSystem;

public class Helmet extends BaseEquipment {
    private float healthModifier = 1f;
    private float strengthModifier = 1f;
    private float staminaModifier = 1f;
    private float armourModifier = 1.05f;
    private float attackModifier = 1.05f;

    public Helmet(BaseCharacter character) {
        super(character);
        
        super.character.setHealth(character.getHealth()*healthModifier);
        super.character.setStrength(character.getStrength()*strengthModifier);
        super.character.setStamina(character.getStamina()*staminaModifier);
        super.character.setArmour(character.getArmour()*armourModifier);
        super.character.setAttack(character.getAttack()*attackModifier);
    }
}

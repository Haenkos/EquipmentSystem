package net.haenkos.EquipmentSystem;

public class Cuirass extends BaseEquipment {
    private float healthModifier = 1.02f;
    private float strengthModifier = 1f;
    private float staminaModifier = 0.95f;
    private float armourModifier = 1.05f;
    private float attackModifier = 1f;

    public Cuirass(BaseCharacter character) {
        super(character);
        
        super.character.setHealth(character.getHealth()*healthModifier);
        super.character.setStrength(character.getStrength()*strengthModifier);
        super.character.setStamina(character.getStamina()*staminaModifier);
        super.character.setArmour(character.getArmour()*armourModifier);
        super.character.setAttack(character.getAttack()*attackModifier);
    }
}

package net.haenkos.EquipmentSystem;

public class Cuirass extends BaseEquipment {
    private float healthModifier = 1.02f;
    private float staminaModifier = 0.95f;
    private float armourModifier = 1.05f;


    public Cuirass(BaseCharacter character) {
        super(character);
        
        super.character.setHealth(character.getHealth()*healthModifier);
        super.character.setStamina(character.getStamina()*staminaModifier);
        super.character.setArmour(character.getArmour()*armourModifier);
    }
}

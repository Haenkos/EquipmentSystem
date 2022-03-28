package net.haenkos.EquipmentSystem;

public class Helmet extends BaseEquipment {

    private float armourModifier = 1.05f;
    private float attackModifier = 1.05f;

    public Helmet(BaseCharacter character) {
        super(character);
        
        super.character.setArmour(character.getArmour()*armourModifier);
        super.character.setAttack(character.getAttack()*attackModifier);
    }
}

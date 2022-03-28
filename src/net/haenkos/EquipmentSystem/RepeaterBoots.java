package net.haenkos.EquipmentSystem;

public class RepeaterBoots extends BaseEquipment {

    public RepeaterBoots(BaseCharacter character) {
        super(character);
    }

    @Override
    public void Jump() {
        character.Jump();
        System.out.println("And jump again!");
    }

}

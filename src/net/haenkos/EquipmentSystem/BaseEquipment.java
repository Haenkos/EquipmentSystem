package net.haenkos.EquipmentSystem;

public abstract class BaseEquipment implements BaseCharacter {
    BaseCharacter character;

    public BaseEquipment(BaseCharacter character) {
        this.character = character;
    }

    @Override
    public void printStats() {
        character.printStats();
    }

    @Override
    public void Attack() {
        character.Attack();
    }

    @Override
    public void Jump() {
        character.Jump();
    }

    @Override
    public float getHealth() {
        return character.getHealth();
    }
    @Override
    public void setHealth(float health) {
        character.setHealth(health);;
    }
    @Override
    public float getStrength() {
        return character.getStrength();
    }
    @Override
    public void setStrength(float strength) {
        character.setStrength(strength);
    }
    @Override
    public float getStamina() {
        return character.getStamina();
    }
    @Override
    public void setStamina(float stamina) {
        character.setStamina(stamina);
    }
    @Override
    public float getArmour() {
        return character.getArmour();
    }
    @Override
    public void setArmour(float armour) {
        character.setArmour(armour);
    }
    @Override
    public float getAttack() {
        return character.getAttack();
    }
    @Override
    public void setAttack(float attack) {
        character.setAttack(attack);
    }
}

package net.haenkos.EquipmentSystem;

public interface BaseCharacter {

    public void printStats();

    public void Attack();

    public void Jump();

    public float getHealth();

    public void setHealth(float health);

    public float getStrength();

    public void setStrength(float strength);

    public float getStamina();

    public void setStamina(float stamina);

    public float getArmour();

    public void setArmour(float armour);

    public float getAttack();

    public void setAttack(float attack);
}

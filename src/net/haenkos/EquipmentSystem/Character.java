package net.haenkos.EquipmentSystem;

public class Character implements BaseCharacter {
    private float health;
    private float strength;
    private float stamina;
    private float armour;
    private float attack;

    public Character() {
        health = 5;
        strength = 5;
        stamina = 5;
        armour = 5;
        attack = 5;
    }

    @Override
    public void printStats() {
        System.out.println("Health: " + health);
        System.out.println("Strength: " + strength);
        System.out.println("Stamina: " + stamina);
        System.out.println("Armour: " + armour);
        System.out.println("Attack: " + attack);
        System.out.println("\n");
    }

    @Override
    public void Attack() {
        System.out.println("Throw fists!");
        
    }

    @Override
    public void Jump() {
        System.out.println("Jump!");
        
    }
    
    public float getHealth() {
        return this.health;
    }
    @Override
    public void setHealth(float health) {
        this.health = health;
    }
    @Override
    public float getStrength() {
        return this.strength;
    }
    @Override
    public void setStrength(float strength) {
        this.strength = strength;
    }
    @Override
    public float getStamina() {
        return this.stamina;
    }
    @Override
    public void setStamina(float stamina) {
        this.stamina = stamina;
    }
    @Override
    public float getArmour() {
        return this.armour;
    }
    @Override
    public void setArmour(float armour) {
        this.armour = armour;
    }
    @Override
    public float getAttack() {
        return this.attack;
    }
    @Override
    public void setAttack(float attack) {
        this.attack = attack;
    }

}

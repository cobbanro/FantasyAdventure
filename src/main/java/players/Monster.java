package players;

import items.Weapon;
import spell.Spell;

public class Monster extends Player{

    private MonsterType type;
    private Weapon weapon;
    private Spell spellName;
    private int spellDamage;

    public Monster(String name, int healthPoints, MonsterType type, Weapon weapon, Spell spellName, int spellDamage) {
        super(name, healthPoints);
        this.type = type;
        this.weapon = weapon;
        this.spellName = spellName;
        this.spellDamage = spellDamage;
    }

    public MonsterType getType() {
        return type;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Spell getSpellName() {
        return spellName;
    }

    public int getSpellDamage() {
        return spellDamage;
    }

    public void attack(Player player){
        int updatedHealth = player.getHealthPoints() - weapon.getDamage();
        player.setHealthPoints(updatedHealth);
    }

}

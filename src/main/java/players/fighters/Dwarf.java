package players.fighters;

import items.Weapon;
import items.WeaponType;
import players.Monster;
import players.Player;
import players.fighters.Fighter;

public class Dwarf extends Fighter {

    private int temperLevel;

    public Dwarf(String name, int healthPoints, Weapon weapon){
        super(name, healthPoints, weapon);
        this.temperLevel = 3;
    }

    public int getTemperLevel() {
        return temperLevel;

    }

    public void attack(Player player) {
        if(temperLevel > 5){
        int updatedHealth = player.getHealthPoints() - weapon.getDamage() + 1;
        player.setHealthPoints(updatedHealth);
        }
        else{
        int updatedHealth = player.getHealthPoints() - weapon.getDamage();
        player.setHealthPoints(updatedHealth);
        }
        this.temperLevel += 1;
    }

}

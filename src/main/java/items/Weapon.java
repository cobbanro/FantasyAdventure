package items;

public class Weapon extends Item {

    private WeaponType weapon;
    private int damage;

    public Weapon(int weight, WeaponType weapon, int damage){
        super(weight);
        this.weapon = weapon;
        this.damage = damage;
    }

}

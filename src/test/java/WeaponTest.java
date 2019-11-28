import items.Item;
import items.Weapon;
import items.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon;

    @Before
    public void before(){
        this.weapon = new Weapon(5, WeaponType.SWORD, 3);
    }

    @Test
    public void getWeight(){
        assertEquals(5, weapon.getWeight());
    }

    @Test
    public void getWeaponType(){
        assertEquals(WeaponType.SWORD, weapon.getWeaponType());
    }

    @Test
    public void getDamage(){
        assertEquals(3, weapon.getDamage());
    }


}

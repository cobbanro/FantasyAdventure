import items.Item;
import items.Weapon;
import items.WeaponType;
import org.junit.Before;
import org.junit.Test;
import players.Rogue;

import static org.junit.Assert.assertEquals;

public class RogueTest {

    Rogue rogue;
    Item item;


    @Before
    public void before(){
        rogue = new Rogue("Lewis", 5, WeaponType.DAGGER, 1);
        item = new Weapon(1, WeaponType.DAGGER, 2);
    }

    @Test
    public void hasName() {
        assertEquals("Lewis", rogue.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(5, rogue.getHealthPoints());
    }

    @Test
    public void hasWeaponType(){
        assertEquals(WeaponType.DAGGER, rogue.getWeaponType());
    }

    @Test
    public void hasStealthLevel() {
        assertEquals(1, rogue.getStealthLevel());
    }

    @Test
    public void canAddToInventory(){
        rogue.addToInventory(item);
        assertEquals(1, rogue.getInventory().size());
        rogue.removeFromInventory(item);
        assertEquals(0, rogue.getInventory().size());
    }

}

import items.Item;
import items.Weapon;
import items.WeaponType;
import org.junit.Before;
import org.junit.Test;
import players.Monster;
import players.MonsterType;
import players.fighters.Knight;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Item item;
    Monster monster;


    @Before
    public void before(){
        item = new Weapon(1, WeaponType.SWORD, 2);
        knight = new Knight("RossL", 5,  (Weapon)item);
        monster = new Monster("Mike",10, MonsterType.OGRE, (Weapon) item, null, 0);
    }

    @Test
    public void canAttack(){
        knight.attack(monster);
        assertEquals(8, monster.getHealthPoints());
    }

}

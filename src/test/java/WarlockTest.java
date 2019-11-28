import org.junit.Before;
import org.junit.Test;
import players.spelldudes.Warlock;
import spell.Spell;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;
    Spell spell;

    @Before
    public void before(){
        warlock = new Warlock("Andy E", 3);
        spell = new Spell("I want that one", 2);
    }

    @Test
    public void checkCastSpell(){
        warlock.learnSpell(spell);
        assertEquals("Andy E casts I want that one and hit for 2", warlock.castSpell(spell));
    }


}

package rooms;

import players.Monster;

public class Room {

    private int treasure;
    private Monster monster;

    public Room(int treasure, Monster monster){
        this.treasure = treasure;
        this.monster = monster;
    }

    public int getTreasure() {
        return treasure;
    }

    public Monster getMonster() {
        return monster;
    }
}

package players;

import behaviours.IFight;
import items.Item;


import java.util.ArrayList;

public abstract class Player {

    private String name;
    protected int healthPoints;
    protected ArrayList<Item> inventory;


    public Player(String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
        inventory = new ArrayList<Item>();

    }


    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void addToInventory(Item item) {
        inventory.add(item);
    }

    public void removeFromInventory(Item item){
        inventory.remove(item);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }
}

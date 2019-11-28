package players.healers;

import players.Player;

import java.util.ArrayList;

public class Healer extends Player {

    private ArrayList<String> healingTool;

    public Healer(String name, int healthPoints){
        super(name, healthPoints);
    }

}

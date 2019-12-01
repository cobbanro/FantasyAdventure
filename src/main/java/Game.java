import players.Player;
import rooms.Room;

import java.util.ArrayList;

public class Game {

    protected ArrayList<Player> players;
    protected ArrayList<Room> rooms;

    public Game(){
        // ArrayList<Player> player, ArrayList<Room> rooms
        this.players = new ArrayList<Player>();
        this.rooms = new ArrayList<Room>();
    }

}

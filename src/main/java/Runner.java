import items.Weapon;
import items.WeaponType;
import players.Monster;
import players.MonsterType;
import players.Player;
import players.fighters.Dwarf;
import players.fighters.Knight;
import players.fighters.Rogue;
import players.healers.Healer;
import players.spelldudes.Warlock;
import players.spelldudes.Wizard;
import rooms.Room;
import spell.Spell;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Game game = new Game();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick your team, select your fighter: Dwarf, Knight or Rouge");
        String fighter = scanner.next();
        fighter.toLowerCase();

        System.out.println("select your Spell Dude: Warlock or Wizard");
        String spellDude = scanner.next();
        spellDude.toLowerCase();

        System.out.println("There is only one healer in the alpha, so it has been added to your team already");

        Player player1;
        Player player2;
        Player player3;

        Weapon club;
        Weapon sword;
        Weapon dagger;

        club = new Weapon(3, WeaponType.CLUB,3);
        sword = new Weapon(2, WeaponType.SWORD, 2);
        dagger = new Weapon(1, WeaponType.DAGGER, 2);


        if(fighter == "dwarf"){
            player1 = new Dwarf("Thoresen", 12, club);
            game.players.add(player1);
        }

        if(fighter == "knight"){
            player1 = new Knight("Cole", 15, sword);
            game.players.add(player1);
        }

        else{
            player1 = new Rogue("Valeera", 10, dagger);
            game.players.add(player1);
        }

        if(spellDude == "warlock"){
            player2 = new Warlock("Guldan", 10);
            game.players.add(player2);
        }

        else{
            player2 = new Wizard("Jaina", 9);
            game.players.add(player2);
        }

        player3 = new Healer("Anduin", 12);
        game.players.add(player3);

        Room room1;
        Monster monster1;
        Weapon crossbow;
        crossbow = new Weapon(2, WeaponType.CROSSBOW, 2);

        monster1 = new Monster("Gerald the Ogre", 20, MonsterType.OGRE, crossbow, null, 0 );
        room1 = new Room(12, monster1);

        Room room2;
        Monster monster2;
        Weapon spear;
        spear = new Weapon(2, WeaponType.SPEAR, 3);

        monster2 = new Monster("Toby the Skeleton", 30, MonsterType.SKELETON, spear, null, 0 );
        room2 = new Room(20, monster2);

        Room room3;
        Monster monster3;
        Spell fireBall;
        spear = new Weapon(2, WeaponType.SPEAR, 3);
        fireBall = new Spell("Flame Thrower", 4, 2 );

        monster3 = new Monster("Rebeca the Dragon", 50, MonsterType.DRAGON, null, fireBall ,4 );
        room3 = new Room(100, monster3);

        System.out.println();
        System.out.println("Room 1: Gerald the Ogre, Battle Start");

        Integer turn = 0;

        while(monster1.getHealthPoints() != 0 || (player1.getHealthPoints() != 0
                && player2.getHealthPoints() != 0 &&
                player3.getHealthPoints() != 0)){
            boolean defended = false;
            System.out.println("Choose your moves:");
            if(player1.getHealthPoints() != 0) {
                System.out.println("What should your fighter do? attack or defend");
                String fighterMove = scanner.next();
                if (fighterMove == "attack") {
                    ((Knight) player1).attack(monster1);
                } else {
                    defended = true;
                }
            }
            if(player2.getHealthPoints() != 0) {
                System.out.println("What should your spell dude do?");
                if (player2.getName() == "Guldan") {
                    System.out.print(" hellfire or darkbomb");
                    System.out.println();
                    String spellDudeMove = scanner.next();
                    if (spellDudeMove == "hellfire") {
                        ((Warlock) player2).castSpell(((Warlock) player2).getHellFire(), monster1);
                    } else {
                        ((Warlock) player2).castSpell(((Warlock) player2).getDarkBomb(), monster1);
                    }
                } else {
                    System.out.print("fireball or ping");
                    System.out.println();
                    String spellDudeMove = scanner.next();
                    if (spellDudeMove == "fireball") {
                        ((Wizard) player2).castSpell(((Wizard) player2).getFireBall(), monster1);
                    } else {
                        ((Wizard) player2).castSpell(((Wizard) player2).getPing(), monster1);
                    }
                }
            }
            if(player3.getHealthPoints() != 0) {
                System.out.println("Who should your healer heal? " + player1.getName() + ", " + player2.getName() + " or himself?");
                String healerMove = scanner.next();
                if (healerMove == player1.getName()) {
                    ((Healer) player3).heal(player1);
                }
                if (healerMove == player2.getName()) {
                    ((Healer) player3).heal(player2);
                } else {
                    ((Healer) player3).heal(player3);
                }
            }

            Random randomNumber = new Random();
           int playerToHit = randomNumber.nextInt(2);
           if(playerToHit == 0) {
               if (defended) {
                   ((Knight)player1).defend(monster1);
                   System.out.println("Gerald attacked " + player1.getName() + " for " + monster1.getWeapon().getDamage());
               }
           }
           if(playerToHit == 1) {
               monster1.attack(player2);
               System.out.println("Gerald attacked " + player2.getName() + " for " + monster1.getWeapon().getDamage());
           }
           else{
               monster3.attack(player3);
               System.out.println("Gerald attacked " + player3.getName() + " for " + monster1.getWeapon().getDamage());
           }
            System.out.println();

            turn += 1;

            System.out.println("End of turn " + turn.toString() + ":");
            System.out.println();
            System.out.println("Gerald has " + monster1.getHealthPoints() + " Health Points");
            System.out.println(player1.getName() + " has " + player1.getHealthPoints() + " Health Points");
            System.out.println(player2.getName() + " has " + player2.getHealthPoints() + " Health Points");
            System.out.println(player3.getName() + " has " + player3.getHealthPoints() + " Health Points");

        }

        if(monster1.getHealthPoints() != 0) {

            System.out.println("Congratulations, you defeated Gerald, you received " + room1.getTreasure() + " gold");
        }
        if (player1.getHealthPoints() != 0
                && player2.getHealthPoints() != 0 &&
                player3.getHealthPoints() != 0){
            System.out.println("Defeat");
        }










    }

}

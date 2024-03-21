package Encapsulation_5;

public class PlayerMain {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());


        EnhancedPlayer groot = new EnhancedPlayer("Groot");
        EnhancedPlayer grootDos = new EnhancedPlayer("Groot", 20000, "Sword");

        System.out.println("Initial health is " + groot.healthRemaining());
        System.out.println("Initial health is " + grootDos.healthRemaining());


    }
}

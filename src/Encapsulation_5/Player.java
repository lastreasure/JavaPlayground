package Encapsulation_5;
public class Player {

    /*
        Example of poor encapsulation
        Problems -> direct access to data on the object (can change health of player)
                -> interdependency, coupling between calling code and class (e.g. multiple name updates)
     */
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {

        health = health - damage;
        if (health <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining() {
        return health;
    }

    public void restoreHealth(int extraHealth) {

        health = health + extraHealth;
        if (health > 100) {
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }
}

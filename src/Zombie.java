/**
 * Child of HorrorCharacter without transformable
 */
public class Zombie extends HorrorCharacter{

    //Attributes

    //Constructors

    /**
     * Constructor for the Zombie class
     * @param vulnerabilities takes an array of vulnerabilities
     * @param health Requires a health
     * @param name Requires a name
     */
    public Zombie(Vulnerability[] vulnerabilities, String name, int health) {
        super(vulnerabilities, name, health);
        //refer to werewolf class constructor for explanation if you forgot
    }
    //Methods
    /**
     * Overwritten from HorrorCharacter class
     */
    @Override
    public void attack() {
        System.out.println(name + " the Zombie attacks!");
    }
    /**
     * Overwritten from HorrorCharacter class
     */
    @Override
    public void flee() {
        System.out.println("The Zombie flees!");
        System.out.println("They had "+ health +" health left!");
    }
}

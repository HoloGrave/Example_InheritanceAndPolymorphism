/**
 * Child of HorrorCharacter and implements Transformable
 */
public class Vampire extends HorrorCharacter implements Transformable{
    //Attributes
    boolean transformed;

    //Constructors

    /**
     * @param vulnerabilities takes an array of vulnerabilities
     * @param name requires a name
     * @param health requires a health
     * @param transformed set whether the vampire is transformed or not on creation
     */
    public Vampire(Vulnerability[] vulnerabilities, String name, int health, boolean transformed) {
        super(vulnerabilities, name, health);
        //Refer to werewolf class constructor for explanation if you forgot
        this.transformed = transformed;
    }

    //Methods

    /**
     * Overwritten from HorrorCharacter class
     */
    @Override
    public void attack() {
        if(this.transformed){
            System.out.println("The Vampire sends their bat swarm!");
        }
        else {
            System.out.println("The Vampire attacks!");
        }
    }
    /**
     * Overwritten from HorrorCharacter class
     */
    @Override
    public void flee() {
        System.out.println(name + " the Vampire flees!");
        System.out.println("They had "+ health +" health left!");
    }
    /**
     * Overwritten from Transformable interface
     */
    @Override
    public void transform() {
        //refer to werewolf class transform method for explanation if you forgot
        this.transformed = !this.transformed;
        //Maybe should add an if else to print a transformation message
    }
}

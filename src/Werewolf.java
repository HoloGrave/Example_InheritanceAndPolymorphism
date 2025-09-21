/**
 * Child of HorrorCharacter and implements Transformable
 */
public class Werewolf extends HorrorCharacter implements Transformable{

    //Attributes
    boolean transformed;
    //Constructors

    /**
     * Constructor for the Werewolf class
     * @param vulnerabilities takes an array of vulnerabilities
     * @param name requires a name
     * @param health requires a health
     * @param transformed set whether the werewolf is transformed or not on creation
     */
    public Werewolf(Vulnerability[] vulnerabilities, String name, int health, boolean transformed) {
        super(vulnerabilities, name, health);
        //The above code looks odd, but it calls the superclass constructor to supply this object's vulnerabilities
        this.transformed = transformed;
    }

    //Methods
    /**
     * Overwritten from HorrorCharacter class
     */
    @Override
    public void attack() {
        if(this.transformed){
            System.out.println("The Werewolf pounces!");
        }
        else {
            System.out.println("The Werewolf attacks!");
        }
    }
    /**
     * Overwritten from HorrorCharacter class
     */
    @Override
    public void flee() {
        System.out.println(name + " the Werewolf flees!");
        System.out.println("They had " + health + " health left!");
    }
    /**
     * Overwritten from transformable interface
     */
    @Override
    public void transform() {
        //simplified if else just to swap whatever state it is
        this.transformed = !this.transformed;
        //Maybe should add an if else to print a transformation message
    }
}

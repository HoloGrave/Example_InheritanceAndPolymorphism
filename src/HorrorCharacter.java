/**
 * This is the superclass for all HorrorCharacters
 */
public class HorrorCharacter {

    //Attributes
    String name;
    int health;
    Vulnerability[] vulnerabilities;

    //Constructor

    /**
     * @param vulnerabilities requires an array of vulnerabilities
     * @param name requires a name
     * @param health requires a health
     */
    public HorrorCharacter(Vulnerability[] vulnerabilities, String name, int health) {
    this.vulnerabilities = vulnerabilities;
    this.name = name;
    this.health = health;
    }

    //Methods
    //THESE SHOULD BE OVERRIDDEN IN SUBCLASSES

    /**
     * Should be overwritten in subclasses.
     */
    public void attack(){}

    /**
     * Should be overwritten in subclasses.
     */
    public void flee(){}

    //Getters and Setters

    /**
     * @return an array of vulnerabilities
     */
    public Vulnerability[] getVulnerabilities(){return this.vulnerabilities;}

    /**
     * @param vulnerabilities requires an array of vulnerabilities
     */
    public void setVulnerabilities(Vulnerability[] vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }
}

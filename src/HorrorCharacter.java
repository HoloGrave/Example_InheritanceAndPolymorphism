public class HorrorCharacter {

    //Attributes
    String name;
    int health;
    Vulnerability[] vulnerabilities;

    //Constructor
    public HorrorCharacter(Vulnerability[] vulnerabilities) {
    setVulnerabilities(vulnerabilities);
    }

    //Methods
    //THESE SHOULD BE OVERRIDDEN IN SUBCLASSES
    public void attack(){}
    public void flee(){}

    //Getters and Setters
    public Vulnerability[] getVulnerabilities(){return this.vulnerabilities;}
    public void setVulnerabilities(Vulnerability[] vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }
}

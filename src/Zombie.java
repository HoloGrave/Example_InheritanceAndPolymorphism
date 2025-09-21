public class Zombie extends HorrorCharacter{

    //Attributes

    //Constructors
    public Zombie(Vulnerability[] vulnerabilities) {
        super(vulnerabilities);
        //refer to werewolf class constructor for explanation if you forgot
    }
    //Methods
    @Override
    public void attack() {
        System.out.println("The Zombie attacks!");
    }
    @Override
    public void flee() {
        System.out.println("The Zombie flees!");
    }
}

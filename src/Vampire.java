public class Vampire extends HorrorCharacter implements Transformable{

    //Attributes
    boolean transformed;

    //Constructors
    public Vampire(Vulnerability[] vulnerabilities, boolean transformed) {
        super(vulnerabilities);
        //Refer to werewolf class constructor for explanation if you forgot
        this.transformed = transformed;
    }

    //Methods
    @Override
    public void attack() {
        if(this.transformed){
            System.out.println("The Vampire sends their bat swarm!");
        }
        else {
            System.out.println("The Vampire attacks!");
        }
    }
    @Override
    public void flee() {
        System.out.println("The Vampire flees!");
    }
    @Override
    public void transform() {
        //refer to werewolf class transform method for explanation if you forgot
        this.transformed = !this.transformed;
        //Maybe should add an if else to print a transformation message
    }
}

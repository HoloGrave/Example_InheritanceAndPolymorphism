public class Werewolf extends HorrorCharacter implements Transformable{

    //Attributes
    boolean transformed;
    //Constructors
    public Werewolf(Vulnerability[] vulnerabilities, boolean transformed) {
        super(vulnerabilities);
        //The above code looks odd, but it calls the superclass constructor to supply this object's vulnerabilities
        this.transformed = transformed;
    }

    //Methods
    @Override
    public void attack() {
        if(this.transformed){
            System.out.println("The Werewolf pounces!");
        }
        else {
            System.out.println("The Werewolf attacks!");
        }
    }
    @Override
    public void flee() {
        System.out.println("The Werewolf flees!");
    }
    @Override
    public void transform() {
        //simplified if else just to swap whatever state it is
        this.transformed = !this.transformed;
        //Maybe should add an if else to print a transformation message
    }
}

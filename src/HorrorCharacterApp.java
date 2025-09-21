public class HorrorCharacterApp {

    //#1
    //Object instatiation & Arraylist creation
    Vulnerability[] wereVuls = new Vulnerability[]{Vulnerability.SILVER};
    Vulnerability[] zomVuls = new Vulnerability[]{Vulnerability.FIRE, Vulnerability.SUNLIGHT};
    Vulnerability[] vampVuls = new Vulnerability[]{Vulnerability.HOLY_WATER, Vulnerability.SUNLIGHT};

    //#2
    Werewolf werewolf = new Werewolf(wereVuls, false);
    Vampire vampire = new Vampire(vampVuls, false);
    Zombie zombie = new Zombie(zomVuls);
    //*3
    HorrorCharacter[] horrorCharacters = {werewolf, vampire, zombie};

public void runHorrorCharacterApp(){
    //#4
    //Run through the list to run the attack and flee methods of the classes
    //Enhanced for loop rather than having to make a new int variable
    for (HorrorCharacter horrorCharacter : horrorCharacters) {
        //*5
        horrorCharacter.attack();
        //we must check for werewolf and vampire to transform them as not every horror character can be transformed
        //therefore we can't just call the transform method on the horror character object in that spot of the array
        if (horrorCharacter == werewolf) {
            werewolf.transform();
            horrorCharacter.attack();
        } else if (horrorCharacter == vampire) {
            vampire.transform();
            horrorCharacter.attack();
        }
        horrorCharacter.flee();
        System.out.println(horrorCharacter.getVulnerabilities().toString());
    }
    /*------What is happening in this code?-------
    *1. We instantiate the array of vulnerabilities for each of the horror characters
    *2. We created each of the horror characters using their constructors and supplying the vulnerabilities we created
    *3. Since all of these horror characters are children of the HorrorCharacter class we can add them all to an array of HorrorCharacters
    *4. Normally we would have to call the methods of each character individually.
        But since they are all HorrorCharacters we can use the array we put them all in to easily run through each of them in an array.
        Polymorphism allows for us to call the same method on each of the objects in the array and call the right method.
        The parent has these methods defined but with nothing in their methods and the child classes override them with their own custom code.
    *5. We can run this fine without any problem despite seeming to run the parent class as its a array of the parent but rather it will run
    *   the overriden code instead if actually overriden
    */

}

}

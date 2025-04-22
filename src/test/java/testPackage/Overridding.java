package testPackage;

public class Overridding {

	public static void main(String[] args) {
        OverriddingAnimal myAnimal = new OverriddingAnimal(); // Create an Animal object
        OverriddingAnimal myDog = new OverriddingDog();       // Create a Dog object

        myAnimal.sound(); // Calls the method in Animal class
        myDog.sound();    // Calls the overridden method in Dog class
    }

}

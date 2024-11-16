public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("Rex");
        Animal myCat = new Cat("Whiskers");
        Pet myParrot = new Parrot("Polly");

        myDog.makeSound();
        myCat.makeSound();

        myParrot.play();

        myDog.displayInfo();
        myCat.displayInfo();
    }
}

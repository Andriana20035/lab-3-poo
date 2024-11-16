public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public void displayInfo() {
        System.out.println("This animal's name is: " + name);
    }
}
